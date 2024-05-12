package com.example.issuemanager.api.app.domain.project;

import jakarta.persistence.Embeddable;
import lombok.NonNull;

import java.util.UUID;

@Embeddable
public record MemberId(@NonNull UUID value) {
    public static MemberId of(String value) {
        return new MemberId(UUID.randomUUID());
    }
}
