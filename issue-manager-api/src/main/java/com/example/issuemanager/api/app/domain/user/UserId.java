package com.example.issuemanager.api.app.domain.user;

import jakarta.persistence.Embeddable;
import lombok.NonNull;

import java.util.UUID;

@Embeddable
public record UserId(@NonNull UUID value) {
    public static UserId init() {
        return new UserId(UUID.randomUUID());
    }
}
