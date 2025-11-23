const { test, expect } = require('@playwright/test');

/**
 * E2E tests for Quiz UI
 * Tests end-to-end user flow through the quiz
 */

test.describe('Quiz E2E Tests', () => {
  
  /**
   * Test: User can access quiz questions endpoint
   */
  test('should load questions from API', async ({ page }) => {
    const response = await page.goto('http://localhost:8080/questions');
    expect(response.status()).toBe(200);
    
    const content = await page.content();
    expect(content).toContain('What is 2 + 2?');
    expect(content).toContain('Capital of France?');
  });
  
  /**
   * Test: User can submit answers and get score
   */
  test('should submit answers and receive score', async ({ page }) => {
    const response = await page.goto('http://localhost:8080/submit?answers=1,2,1');
    expect(response.status()).toBe(200);
    
    const content = await page.content();
    expect(content).toContain('"total":3');
    expect(content).toContain('"correct":3');
  });
  
  /**
   * Test: Wrong answers return low score
   */
  test('should return zero score for wrong answers', async ({ page }) => {
    const response = await page.goto('http://localhost:8080/submit?answers=0,0,0');
    expect(response.status()).toBe(200);
    
    const content = await page.content();
    expect(content).toContain('"correct":0');
  });
  
});
