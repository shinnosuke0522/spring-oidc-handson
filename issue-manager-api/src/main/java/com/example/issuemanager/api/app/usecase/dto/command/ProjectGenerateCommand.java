package com.example.issuemanager.api.app.usecase.dto.command;

import com.example.issuemanager.api.app.domain.user.UserId;
import lombok.NonNull;

public record ProjectSaveCommand(
        @NonNull String name, @NonNull UserId userId) {
}
