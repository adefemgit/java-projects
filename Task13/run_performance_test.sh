#!/bin/bash

# Performance Test Execution Script
# Online Quiz System - Task13

set -e

echo ""
echo "Quiz System Performance Test Runner"
echo ""
echo ""

# Configuration
PROJECT_DIR="/Users/jnr/Documents/Sysdev_project"
TEST_PLAN="$PROJECT_DIR/Task13/performance/QuizLoadTest.jmx"
RESULTS_DIR="$PROJECT_DIR/Task13/reports"
RESULTS_FILE="$RESULTS_DIR/results.jtl"
HTML_REPORT="$RESULTS_DIR/html-report"
SERVER_URL="http://localhost:8080"

# Default values
THREADS=1000
RAMPUP=300
MODE="cli"

# Parse arguments
while getopts "t:r:m:h" opt; do
  case $opt in
    t) THREADS=$OPTARG ;;
    r) RAMPUP=$OPTARG ;;
    m) MODE=$OPTARG ;;
    h)
      echo "Usage: $0 [-t threads] [-r rampup] [-m mode]"
      echo "  -t: Number of threads/users (default: 1000)"
      echo "  -r: Ramp-up period in seconds (default: 300)"
      echo "  -m: Mode - 'gui' or 'cli' (default: cli)"
      echo "  -h: Show this help message"
      exit 0
      ;;
    \?)
      echo "Invalid option: -$OPTARG" >&2
      exit 1
      ;;
  esac
done

echo "Test Configuration:"
echo "  Threads: $THREADS"
echo "  Ramp-up: $RAMPUP seconds"
echo "  Mode: $MODE"
echo ""

# Check if JMeter is installed
if ! command -v jmeter &> /dev/null; then
    echo "ERROR: JMeter is not installed or not in PATH"
    echo "Install with: brew install jmeter (macOS)"
    exit 1
fi

echo "JMeter version:"
jmeter --version
echo ""

# Check if server is running
echo "Checking if Quiz server is running..."
if curl -s "$SERVER_URL" > /dev/null; then
    echo "✓ Server is running at $SERVER_URL"
else
    echo "✗ Server is NOT running at $SERVER_URL"
    echo ""
    echo "Please start the server first:"
    echo "  cd $PROJECT_DIR"
    echo "  javac Main.java"
    echo "  java Main"
    exit 1
fi
echo ""

# Clean previous results
if [ -d "$RESULTS_DIR" ]; then
    echo "Cleaning previous test results..."
    rm -rf "$RESULTS_FILE" "$HTML_REPORT"
    mkdir -p "$RESULTS_DIR"
else
    mkdir -p "$RESULTS_DIR"
fi

# Run tests based on mode
if [ "$MODE" = "gui" ]; then
    echo "Starting JMeter in GUI mode..."
    echo "Please run the test manually from the GUI"
    jmeter -t "$TEST_PLAN"
else
    echo "Running performance tests..."
    echo "This will take approximately $((RAMPUP / 60)) minutes..."
    echo ""
    
    # Run JMeter in CLI mode
    jmeter -n \
           -t "$TEST_PLAN" \
           -l "$RESULTS_FILE" \
           -e \
           -o "$HTML_REPORT" \
           -JTHREADS="$THREADS" \
           -JRAMPUP="$RAMPUP"
    
    echo ""
    echo "========================================="
    echo "Test Completed Successfully!"
    echo "========================================="
    echo ""
    echo "Results saved to:"
    echo "  Raw data: $RESULTS_FILE"
    echo "  HTML Report: $HTML_REPORT/index.html"
    echo ""
    
    # Quick summary from results file
    if [ -f "$RESULTS_FILE" ]; then
        echo "Quick Summary:"
        TOTAL_REQUESTS=$(wc -l < "$RESULTS_FILE" | tr -d ' ')
        TOTAL_REQUESTS=$((TOTAL_REQUESTS - 1))  # Subtract header line
        echo "  Total Requests: $TOTAL_REQUESTS"
        
        # Count failures (lines with "false" in success column)
        FAILURES=$(grep -c "false" "$RESULTS_FILE" || true)
        echo "  Failed Requests: $FAILURES"
        echo "  Success Rate: $(awk "BEGIN {printf \"%.2f%%\", (($TOTAL_REQUESTS - $FAILURES) / $TOTAL_REQUESTS) * 100}")"
    fi
    echo ""
    
    # Open HTML report
    echo "Opening HTML report in browser..."
    if [[ "$OSTYPE" == "darwin"* ]]; then
        open "$HTML_REPORT/index.html"
    elif [[ "$OSTYPE" == "linux-gnu"* ]]; then
        xdg-open "$HTML_REPORT/index.html"
    else
        echo "Please open manually: $HTML_REPORT/index.html"
    fi
fi

echo ""
echo "Next steps:"
echo "1. Review the HTML dashboard"
echo "2. Analyze response time graphs"
echo "3. Check for errors and bottlenecks"
echo "4. Generate PDF report for documentation"
echo "5. Upload PDF to Performance_test_JMeter shared folder"
