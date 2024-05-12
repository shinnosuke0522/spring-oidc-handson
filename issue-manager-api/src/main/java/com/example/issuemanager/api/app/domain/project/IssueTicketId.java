package com.example.issuemanager.api.app.domain.project;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record IssueTicketId(UUID value) {
    public static IssueTicketId init() {
        return new IssueTicketId(UUID.randomUUID());
    }
}
