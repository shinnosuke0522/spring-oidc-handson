package com.example.issuemanager.api.app.domain.project;

import com.example.issuemanager.api.app.domain.user.UserId;
import jakarta.annotation.Nullable;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.With;
import lombok.experimental.Accessors;
import lombok.experimental.Wither;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "issue_ticket")
@Immutable
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@Getter
@Accessors(fluent = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IssueTicket {
    @Id
    @NonNull
    @EmbeddedId
    private IssueTicketId id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @Setter(AccessLevel.PACKAGE)
    private Project project;

    @With
    @NonNull
    private String title;

    @With
    @NonNull
    private String description;

    @With
    @NonNull
    @Enumerated(value = EnumType.STRING)
    private Priority priority;

    @With
    @NonNull
    @Enumerated(value = EnumType.STRING)
    private IssueTicketStatus status;

    @With
    @NonNull
    @Enumerated
    private UserId reporter;

    @With
    @Nullable
    @Enumerated
    private UserId assignee;

    private IssueTicket(
            @NonNull String title,
            @NonNull String description,
            @NonNull Priority priority,
            @NonNull UserId reporter,
            UserId assignee
    ) {
        this(
                IssueTicketId.init(),
                null,
                title,
                description,
                priority,
                IssueTicketStatus.TODO,
                reporter,
                assignee
        );
    }
}
