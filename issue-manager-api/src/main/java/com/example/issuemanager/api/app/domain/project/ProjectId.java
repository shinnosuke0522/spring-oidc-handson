package com.example.issuemanager.api.app.domain.project;

import jakarta.persistence.Embeddable;
import lombok.NonNull;

import java.util.UUID;

@Embeddable
public record ProjectId(@NonNull UUID value) {
    public static ProjectId init() {
        return new ProjectId(UUID.randomUUID());
    }
}
