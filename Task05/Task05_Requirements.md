Task 5 — Requirements

Functional Requirements (two-member team: 6 total)

FR-01
- ID: FR-01
- Title: Secure Authentication
- Description: As a learner, I want to create an account and sign in so that I can access and track quizzes.
- Requirement source: Stakeholder interviews
- Approver / Approval date / Approval status: Product Owner / TBD / Pending
- Priority: High
- Estimation: 5 points
- Acceptance Criteria (AC):
  - Given valid credentials, when the user submits Login, then the system authenticates and redirects to Catalog.
  - Given a duplicate username during Registration, when submitted, then an error "Username already exists" is shown.

FR-02
- ID: FR-02
- Title: Quiz Catalog with Filters
- Description: As a learner, I want to filter quizzes by category and difficulty so that I can find suitable content quickly.
- Requirement source: Market research
- Approver / Approval date / Approval status: Product Owner / TBD / Pending
- Priority: High
- Estimation: 3 points
- Acceptance Criteria (AC):
  - Given quizzes exist, when filters are applied, then only matching quizzes are shown.
  - Given many quizzes, when pagination controls are used, then the next page displays correctly.

FR-03
- ID: FR-03
- Title: Randomized Questions and Options
- Description: As a learner, I want randomized question and option order so that attempts are unique and cheating is reduced.
- Requirement source: Anti-cheat requirement
- Approver / Approval date / Approval status: Security Lead / TBD / Pending
- Priority: High
- Estimation: 3 points
- Acceptance Criteria (AC):
  - Given a quiz pool, when starting a quiz, then question order differs between attempts.
  - Given options A–D, when rendered, then option order is randomized per attempt.

FR-04
- ID: FR-04
- Title: Quiz Navigation and Flagging
- Description: As a learner, I want Next/Back navigation and the ability to flag questions for later review.
- Requirement source: UX interviews
- Approver / Approval date / Approval status: UX Lead / TBD / Pending
- Priority: Medium
- Estimation: 3 points
- Acceptance Criteria (AC):
  - Given multiple questions, when Next/Back is clicked, then selections persist across navigation.
  - Given a flagged question, when the question map is opened, then a flag indicator is visible.

FR-05
- ID: FR-05
- Title: Submission and Instant Scoring
- Description: As a learner, I want to submit my answers and see a score breakdown (correct/incorrect/unanswered, time spent).
- Requirement source: Learning outcomes
- Approver / Approval date / Approval status: Product Owner / TBD / Pending
- Priority: High
- Estimation: 5 points
- Acceptance Criteria (AC):
  - Given responses, when Submit is confirmed, then the system calculates and displays score and breakdown.
  - Given unanswered questions, when Submit is executed, then those are counted per specification.

FR-06
- ID: FR-06
- Title: Results Review with Explanations
- Description: As a learner, I want to compare my answers vs correct answers and read explanations so that I learn from mistakes.
- Requirement source: Pedagogy requirement
- Approver / Approval date / Approval status: Product Owner / TBD / Pending
- Priority: High
- Estimation: 3 points
- Acceptance Criteria (AC):
  - Given a completed attempt, when Review is opened, then each question shows the user answer, the correct one, and explanation.
  - Given the review page, when items are expanded, then content loads without page refresh.


