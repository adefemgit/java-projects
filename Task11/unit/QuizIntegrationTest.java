package Task11.unit;

import org.junit.jupiter.api.Test;
import java.net.http.*;
import java.net.URI;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test for Quiz API endpoints
 * Tests interaction between HTTP server and quiz logic
 */
public class QuizIntegrationTest {
    
    private static final String BASE_URL = "http://localhost:8080";
    
    /**
     * Test: GET /questions returns valid JSON response
     */
    @Test
    public void testGetQuestions_returnsValidResponse() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL + "/questions"))
            .GET()
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        assertEquals(200, response.statusCode(), "Should return 200 OK");
        assertTrue(response.body().contains("What is 2 + 2?"), "Should contain question text");
        assertTrue(response.body().startsWith("["), "Should return JSON array");
    }
    
    /**
     * Test: POST /submit with correct answers returns full score
     */
    @Test
    public void testSubmit_allCorrect_returnsFullScore() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL + "/submit?answers=1,2,1"))
            .POST(HttpRequest.BodyPublishers.noBody())
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        assertEquals(200, response.statusCode(), "Should return 200 OK");
        assertTrue(response.body().contains("\"correct\":3"), "Should score 3 correct");
        assertTrue(response.body().contains("\"total\":3"), "Should have 3 total");
    }
    
    /**
     * Test: Submit with wrong answers returns lower score
     */
    @Test
    public void testSubmit_wrongAnswers_returnsPartialScore() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL + "/submit?answers=0,0,0"))
            .POST(HttpRequest.BodyPublishers.noBody())
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        assertEquals(200, response.statusCode());
        assertTrue(response.body().contains("\"correct\":0"), "Should score 0 correct");
    }
}
