package com.example.issuemanager.app.domain.project;

import com.example.issuemanager.app.domain.user.UserId;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("ADDRESSED")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AddressedIssueTicket extends IssueTicket {
    private final IssueStatus status = IssueStatus.ADDRESSED;

    private UserId assigneeId;

    @Override
    public UserId assigneeId() {
        return this.assigneeId;
    }

    @Override
    public IssueStatus status() {
        return status;
    }
}
