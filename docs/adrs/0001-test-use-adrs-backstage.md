---
Title: Example ADR template
Date: 2025-09-17
Deciders: Jack Maloney, Hen Wagner
Technical Story: As part of the Center of Excellence at HMCTS, we want to see an example of an ADR template so that we can create our own ADRs for future decisions.
---
## Status

Proposed — under review by CoE team.

## Context

***Note:*** The below is an example of an Architectural Decision Record (ADR) template that can be used to document significant technical and architectural decisions within a team or organization. The content is not real and only used as an illustration of how to structure an ADR within HMCTS and to show how it appears in Backstage.

The CoE (Center of Excellence) at HMCTS needs a documented way to capture significant technical and architectural decisions. Without a template, different teams produce ADRs in varied formats, which makes them harder to read, compare, and maintain. By standardizing on an ADR template, we aim to improve clarity, consistency, and knowledge sharing in future decisions. This helps onboarding, auditing, and revisiting past decisions when requirements change or when someone new joins the team.

## Decision

We decided to adopt a standard ADR template that includes the following sections: Context, Decision, Consequences, Alternatives Considered, Related Decisions, and Status. This template will be used by all teams in HMCTS when documenting architectural or significant technical choices.

## Consequences

### Pros

- Ensures uniformity in how decisions are documented, making it easier to find and understand ADRs across projects.

- Improves transparency: stakeholders can more easily track why certain choices were made and what trade-offs were considered.

- Speeds up decision documentation: having a template reduces the time and friction of writing ADRs.

- Helps future teams understand past decisions, making change, refactoring, or deprecation safer.

- Can be used to help AI/LLMs to accurately summarise changes in product decisions.
-
### Cons / Risks

- Some overhead: teams will need to spend time filling in all template sections, especially early on or for smaller decisions.

- Risk of boilerplate: if the template is too rigid or long, ADRs might become perfunctory and less valuable.

- Template versioning: decisions about what sections are required may evolve, and maintaining the template (and migrating existing ADRs) could add maintenance burden.

- Adoption resistance: teams might resist using a formal template, especially if not convinced of its value.

## Alternatives Considered

- No standard template: Allow each team to write ADRs as they see fit. Rejected because it perpetuates inconsistency and makes it harder to share knowledge.

- Lightweight ADRs: Very minimal ADR format (e.g. only Title, Decision, Status). Considered, but rejected because missing details reduce usefulness in long-term decision tracking and auditing.

- Adopt an external ADR tool or service: Use third-party ADR tools or platforms. Rejected because we want control, integration with existing workflows, version control, and minimal external dependencies.
---

## Further Considerations

- Is there anything else that should be considered or included in this ADR?

---

