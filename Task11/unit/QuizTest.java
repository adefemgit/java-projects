package Task11.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Quiz scoring logic
 * Tests happy path and exception scenarios
 */
public class QuizTest {
    
    /**
     * Test: Verify correct answer counting (happy path)
     */
    @Test
    public void testScoring_allCorrect() {
        int[] correctAnswers = {1, 2, 1};
        int[] userAnswers = {1, 2, 1};
        int score = calculateScore(userAnswers, correctAnswers);
        assertEquals(3, score, "All correct answers should score 3/3");
    }
    
    /**
     * Test: Verify partial correct answers
     */
    @Test
    public void testScoring_partialCorrect() {
        int[] correctAnswers = {1, 2, 1};
        int[] userAnswers = {1, 0, 1};
        int score = calculateScore(userAnswers, correctAnswers);
        assertEquals(2, score, "Two correct answers should score 2/3");
    }
    
    /**
     * Test: Handle empty answers (exception case)
     */
    @Test
    public void testScoring_emptyAnswers() {
        int[] correctAnswers = {1, 2, 1};
        int[] userAnswers = {};
        int score = calculateScore(userAnswers, correctAnswers);
        assertEquals(0, score, "Empty answers should score 0");
    }
    
    /**
     * Test: Handle null input (exception case)
     */
    @Test
    public void testScoring_nullInput() {
        int[] correctAnswers = {1, 2, 1};
        assertThrows(NullPointerException.class, () -> {
            calculateScore(null, correctAnswers);
        }, "Null input should throw exception");
    }
    
    // Helper method mimicking scoring logic
    private int calculateScore(int[] userAnswers, int[] correctAnswers) {
        if (userAnswers == null) throw new NullPointerException();
        int correct = 0;
        int total = Math.min(userAnswers.length, correctAnswers.length);
        for (int i = 0; i < total; i++) {
            if (userAnswers[i] == correctAnswers[i]) correct++;
        }
        return correct;
    }
}
