package com.example.issuemanager.api.app.domain.project;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum IssueTicketStatus {
    TODO,
    IN_PROGRESS,
    PENDING,
    ADDRESSED,
}
