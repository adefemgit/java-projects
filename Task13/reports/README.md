# Test Results and Reports

This directory contains performance test results and generated reports.

## Directory Contents

- `results.jtl` - Raw JMeter test results (CSV/XML format)
- `html-report/` - JMeter HTML dashboard (auto-generated)
- `screenshots/` - Screenshots of key performance graphs
- `PERFORMANCE_TEST_REPORT_TEMPLATE.txt` - Template for final PDF report

## Viewing Results

### HTML Dashboard
Open `html-report/index.html` in your web browser to view:
- Interactive performance charts
- Response time analysis
- Throughput metrics
- Error statistics
- Detailed test results

### Raw Results
The `results.jtl` file contains timestamped data for each request and can be:
- Imported into JMeter for analysis
- Processed with custom scripts
- Used to regenerate HTML reports

## Generating Reports

After running tests, use the report template to create the final PDF:

1. Open `PERFORMANCE_TEST_REPORT_TEMPLATE.txt`
2. Fill in all `[INSERT]` placeholders with data from HTML dashboard
3. Add screenshots from `screenshots/` directory
4. Convert to PDF using Word, Google Docs, or Pandoc
5. Upload PDF to shared folder: `Performance_test_JMeter`

## Note

Test results are gitignored by default to avoid committing large files.
Only the final PDF report should be uploaded to the shared folder.
