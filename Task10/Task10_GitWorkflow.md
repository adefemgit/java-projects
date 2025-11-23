Task 10: Git Workflow Guide (for two teammates)

Issue Creation (Both Members)

Member 1: Create Issue
- **Title**: Add question validation feature
- **Description**: Validate that questions have at least 2 options before accepting
- **Labels**: `feature`, `enhancement`
- **Assignee**: Member 2

Member 2: Create Issue  
- **Title**: Improve score response format
- **Description**: Add percentage and grade (A/B/C) to score response
- **Labels**: `feature`, `ui`
- **Assignee**: Member 1

Workflow Steps

1. Add Issues to Backlog
- In GitHub Projects, move both issues to "Backlog"

2. Member 2 Works on Question Validation
```bash
git checkout -b feature/question-validation
# Make changes to Main.java
git add Main.java
git commit -m "Add validation for question options"
git push origin feature/question-validation
```
- Open Pull Request
- Set Member 1 as reviewer
- Move issue to "In Review"

3. Member 1 Reviews and Requests Changes
- Comment: "Please add error message for invalid questions"
- Request changes

4. Member 2 Applies Changes
```bash
git add Main.java
git commit -m "Add error message for validation"
git push origin feature/question-validation
```

5. Member 1 Approves and Merges
- Approve PR
- Merge using "Squash and merge" or "Create merge commit"
- Delete branch `feature/question-validation`
- Move issue to "Done"

6. Swap Roles
Member 1 now works on score format improvement, Member 2 reviews

Merge Types Reference
- **Merge commit**: Preserves all commits
- **Squash and merge**: Combines commits into one
- **Rebase and merge**: Linear history

Reference: https://lukemerrett.com/different-merge-types-in-git/
