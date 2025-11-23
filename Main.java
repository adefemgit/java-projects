import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Simple Online Quiz System
 * Provides REST endpoints for quiz questions and answer submission
 * @author Quiz Team
 * @version 1.0
 */
public class Main {
    /**
     * Quiz questions stored as 2D array
     * First element is the question text, followed by options
     */
    static String[][] questions = {
        {"What is 2 + 2?", "1", "4", "3", "5"},
        {"Capital of France?", "Berlin", "Madrid", "Paris", "Rome"},
        {"Java file extension?", ".js", ".java", ".py", ".class"}
    };
    
    /**
     * Correct answer indices for each question (0-based)
     */
    static int[] answers = {1, 2, 1};

    /**
     * Main entry point - starts HTTP server on port 8080
     * @param args command line arguments (not used)
     * @throws Exception if server cannot start
     */
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // GET /questions - return all questions
        server.createContext("/questions", exchange -> {
            if (!"GET".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }
            
            StringBuilder response = new StringBuilder("[");
            for (int i = 0; i < questions.length; i++) {
                response.append("{\"text\":\"").append(questions[i][0]).append("\",\"options\":[");
                for (int j = 1; j < questions[i].length; j++) {
                    response.append("\"").append(questions[i][j]).append("\"");
                    if (j < questions[i].length - 1) response.append(",");
                }
                response.append("]}");
                if (i < questions.length - 1) response.append(",");
            }
            response.append("]");
            
            byte[] responseBytes = response.toString().getBytes("UTF-8");
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        });
        
        // POST /submit?answers=1,2,1 - calculate score
        server.createContext("/submit", exchange -> {
            if (!"POST".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }
            
            String query = exchange.getRequestURI().getQuery();
            if (query == null || !query.contains("=")) {
                String error = "{\"error\":\"Missing answers parameter\"}";
                byte[] errorBytes = error.getBytes("UTF-8");
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(400, errorBytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(errorBytes);
                }
                return;
            }
            
            try {
                String[] parts = query.split("=")[1].split(",");
                int correct = 0;
                for (int i = 0; i < parts.length && i < answers.length; i++) {
                    if (Integer.parseInt(parts[i]) == answers[i]) correct++;
                }
                String response = "{\"total\":" + parts.length + ",\"correct\":" + correct + "}";
                byte[] responseBytes = response.getBytes("UTF-8");
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, responseBytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(responseBytes);
                }
            } catch (NumberFormatException e) {
                String error = "{\"error\":\"Invalid answer format\"}";
                byte[] errorBytes = error.getBytes("UTF-8");
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(400, errorBytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(errorBytes);
                }
            }
        });
        
        // Root endpoint - welcome message (must be last)
        server.createContext("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            
            // Only handle exact root path
            if (!"/".equals(path)) {
                exchange.sendResponseHeaders(404, -1);
                return;
            }
            
            StringBuilder html = new StringBuilder();
            html.append("<!DOCTYPE html><html><head>")
                .append("<meta charset='UTF-8'>")
                .append("<title>Online Quiz System</title>")
                .append("<style>")
                .append("body { font-family: Arial, sans-serif; max-width: 600px; margin: 50px auto; padding: 20px; }")
                .append("h1 { color: #333; }")
                .append(".question { margin: 20px 0; padding: 15px; background: #f5f5f5; border-radius: 5px; }")
                .append(".options { margin: 10px 0; }")
                .append(".option { margin: 5px 0; }")
                .append("button { background: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; font-size: 16px; }")
                .append("button:hover { background: #45a049; }")
                .append(".result { margin-top: 20px; padding: 15px; background: #e3f2fd; border-radius: 5px; display: none; }")
                .append(".score { font-size: 24px; font-weight: bold; color: #1976d2; }")
                .append("</style></head><body>");
            
            html.append("<h1>Online Quiz System</h1>")
                .append("<form id='quizForm'>");
            
            // Generate questions
            for (int i = 0; i < questions.length; i++) {
                html.append("<div class='question'>")
                    .append("<h3>Question ").append(i + 1).append(": ").append(questions[i][0]).append("</h3>")
                    .append("<div class='options'>");
                
                for (int j = 1; j < questions[i].length; j++) {
                    html.append("<div class='option'>")
                        .append("<input type='radio' name='q").append(i).append("' value='").append(j-1).append("' id='q").append(i).append("_").append(j-1).append("' required>")
                        .append("<label for='q").append(i).append("_").append(j-1).append("'>").append(questions[i][j]).append("</label>")
                        .append("</div>");
                }
                
                html.append("</div></div>");
            }
            
            html.append("<button type='submit'>Submit Quiz</button>")
                .append("</form>")
                .append("<div class='result' id='result'></div>")
                .append("<script>")
                .append("document.getElementById('quizForm').addEventListener('submit', function(e) {")
                .append("  e.preventDefault();")
                .append("  var answers = [];")
                .append("  for(var i = 0; i < ").append(questions.length).append("; i++) {")
                .append("    var selected = document.querySelector('input[name=\"q' + i + '\"]:checked');")
                .append("    if(selected) answers.push(selected.value);")
                .append("  }")
                .append("  fetch('/submit?answers=' + answers.join(','), {method: 'POST'})")
                .append("    .then(r => r.json())")
                .append("    .then(data => {")
                .append("      var resultDiv = document.getElementById('result');")
                .append("      resultDiv.innerHTML = '<h2>Quiz Results</h2><p class=\"score\">Score: ' + data.correct + '/' + data.total + '</p>' +")
                .append("        '<p>Percentage: ' + Math.round((data.correct/data.total)*100) + '%</p>';")
                .append("      resultDiv.style.display = 'block';")
                .append("      window.scrollTo(0, document.body.scrollHeight);")
                .append("    });")
                .append("});")
                .append("</script></body></html>");
            
            byte[] responseBytes = html.toString().getBytes("UTF-8");
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        });
        
        server.start();
        System.out.println("Server running at http://localhost:8080");
        System.out.println("Try: http://localhost:8080/questions");
        System.out.println("Try: http://localhost:8080/submit?answers=1,2,1");
    }
}
