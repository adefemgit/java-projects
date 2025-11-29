Task 13 - Performance and Load Testing

Overview

This task implements comprehensive performance and load testing for the Online Quiz System using Apache JMeter. The tests validate that the system meets non-functional requirements under normal and peak traffic conditions.

Test Objectives

1. Verify system can handle 1000 concurrent users
2. Ensure response times remain under 2 seconds (NFR requirement)
3. Measure system throughput and identify bottlenecks
4. Validate API endpoints under load
5. Generate performance reports for analysis

Test Configuration

Thread Configuration
- Total Users (Threads): 1000
- Ramp-up Period: 300 seconds (5 minutes)
- Ramp-up Rate: ~3.33 users per second
- Loop Count: 1 iteration per user
- Total Requests: 3000 (3 requests per user)

Test Scenarios

Scenario 1: Home Page Load (GET /)
- Simulates user accessing quiz interface
- Validates HTML response
- Assertion: Response code 200
- Assertion: Response time < 2000ms

Scenario 2: Questions API (GET /questions)
- Simulates fetching quiz questions
- Validates JSON response structure
- Assertion: Response code 200
- Assertion: Response time < 2000ms
- Assertion: JSON contains expected question data

Scenario 3: Quiz Submission (POST /submit)
- Simulates user submitting quiz answers
- Tests with correct answers (1,2,1)
- Validates scoring logic under load
- Assertion: Response code 200
- Assertion: Response time < 2000ms
- Assertion: Correct score returned (3/3)

Think Time
- 1 second delay between requests to simulate realistic user behavior

Prerequisites

JMeter Installation

macOS:
```
brew install jmeter
```

Linux:
```
wget https://downloads.apache.org/jmeter/binaries/apache-jmeter-5.6.3.tgz
tar -xzf apache-jmeter-5.6.3.tgz
export PATH=$PATH:~/apache-jmeter-5.6.3/bin
```

Windows:
Download from: https://jmeter.apache.org/download_jmeter.cgi
Extract and add bin/ to PATH

Running the Tests

Step 1: Start the Quiz Application
```
cd /Users/jnr/Documents/Sysdev_project
javac Main.java
java Main
```
Verify server is running at http://localhost:8080

Step 2: Run Performance Tests (GUI Mode - for test development)
```
cd Task13/performance
jmeter -t QuizLoadTest.jmx
```

Step 3: Run Performance Tests (CLI Mode - recommended for actual testing)
```
cd Task13/performance
jmeter -n -t QuizLoadTest.jmx -l ../reports/results.jtl -e -o ../reports/html-report
```

Command Options:
- `-n`: Non-GUI mode
- `-t`: Test plan file
- `-l`: Log file (results)
- `-e`: Generate report dashboard
- `-o`: Output folder for HTML report

Step 4: View Results
Open the HTML report:
```
open ../reports/html-report/index.html
```

Performance Metrics

Key Metrics to Monitor

1. Response Time
   - Average: Should be < 1000ms
   - 90th Percentile: Should be < 1500ms
   - 95th Percentile: Should be < 2000ms
   - Max: Should be < 3000ms

2. Throughput
   - Requests per second
   - Target: > 100 requests/sec for 1000 users

3. Error Rate
   - Target: < 1% errors
   - All assertions should pass

4. Latency
   - Time to first byte
   - Should be minimal (< 500ms)

5. Resource Utilization
   - CPU usage
   - Memory consumption
   - Network bandwidth

Expected Results

Under Normal Load (1000 concurrent users):
- All requests should complete successfully
- Response times should stay under 2 second threshold
- No 500 errors or timeouts
- Throughput should be consistent throughout test
- System should remain stable during ramp-up

Deliverables

1. Test Plan
   - Location: Task13/performance/QuizLoadTest.jmx
   - Version controlled in GitHub

2. Test Results
   - Raw results: Task13/reports/results.jtl
   - HTML dashboard: Task13/reports/html-report/
   - Screenshots: Task13/reports/screenshots/

3. Performance Report (PDF)
   - Summary of test execution
   - Performance metrics analysis
   - Response time graphs
   - Throughput analysis
   - Bottleneck identification
   - Recommendations
   - Location: Shared folder (Performance_test_JMeter)

Report Structure

Executive Summary
- Test objectives
- Test configuration
- Overall results (Pass/Fail)

Test Environment
- Server specifications
- JMeter version
- Java version
- Network configuration

Test Execution Details
- Test duration
- Number of virtual users
- Ramp-up period
- Total requests executed

Performance Metrics
- Average response time per endpoint
- 90th and 95th percentile response times
- Throughput (requests/second)
- Error rate
- Network throughput (bytes/second)

Graphical Analysis
- Response time over time graph
- Active threads over time
- Transactions per second graph
- Response time percentiles
- Error rate over time

Bottleneck Analysis
- Identified performance issues
- Resource constraints
- Slow endpoints

Recommendations
- Performance optimization suggestions
- Scalability improvements
- Infrastructure recommendations

Conclusion
- NFR compliance status
- System readiness for production

Troubleshooting

Common Issues

Issue: Connection refused errors
Solution: Ensure Main.java server is running on port 8080

Issue: High response times during ramp-up
Solution: This is expected as load increases. Focus on steady-state performance.

Issue: Out of memory errors in JMeter
Solution: Increase JMeter heap size:
```
export JVM_ARGS="-Xms512m -Xmx2048m"
```

Issue: File not found for report generation
Solution: Ensure Task13/reports directory exists and has write permissions

Advanced Configuration

Modifying Test Parameters

Edit variables in the test plan or via command line:

Custom thread count:

jmeter -n -t QuizLoadTest.jmx -JTHREADS=500 -l results.jtl


Custom ramp-up period:

jmeter -n -t QuizLoadTest.jmx -JRAMPUP=600 -l results.jtl


Custom base URL:

jmeter -n -t QuizLoadTest.jmx -JBASE_URL=192.168.1.100 -l results.jtl


Continuous Integration

For CI/CD pipelines (GitHub Actions):

- name: Run Performance Tests
  run: |
    java Main &
    sleep 5
    jmeter -n -t Task13/performance/QuizLoadTest.jmx -l results.jtl
    if [ $? -ne 0 ]; then exit 1; fi



