package com.example.issuemanager.api.app.domain.project;

import com.example.issuemanager.api.app.domain.user.UserId;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.With;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Immutable;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Immutable
@Table(name = "project")
@Getter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Project extends AbstractAggregateRoot<Project> {
    @Id
    @EmbeddedId
    private ProjectId id;

    @With
    private String name;

    @With(AccessLevel.PRIVATE)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "project")
    private Set<Member> members;

    @With(AccessLevel.PRIVATE)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "project")
    private Set<IssueTicket> issueTickets;

    private Project(String name, Set<Member> members, Set<IssueTicket> issueTickets) {
        this.id = ProjectId.init();
        this.name = name;
        this.members = members;
        this.issueTickets = issueTickets;

        members.forEach(m -> m.project(this));
        issueTickets.forEach(it -> it.project(this));
    }

    public static Project init(@NonNull String name, @NonNull UserId userId) {
        Set<Member> members = new HashSet<>();
        members.add(new Member(userId, MemberRole.ADMIN_USER));

        return new Project(name, members, new HashSet<>());
    }

    // Member
    public Optional<Member> getMember(@NonNull UUID memberId) {
        return members.stream()
                      .filter(e -> e.id().equals(memberId))
                      .findFirst();
    }

    public Project addMember(@NonNull Member newMember) {
        Set<Member> copiedMembers = new HashSet<>(members);
        copiedMembers.add(newMember);

        return this.withMembers(copiedMembers);
    }

    public Project removeMember(@NonNull Member operator, @NonNull Member removeMember) {
        if (MemberRole.ADMIN_USER != operator.role()) {
            throw new IllegalStateException(
                "This member does not allowed to perform this operation. member id: " + operator.id()
            );
        }

        var newMembers = members.stream()
                                .filter(e -> !e.id().equals(removeMember.id()))
                                .collect(Collectors.toSet());

        return this.withMembers(newMembers);
    }

    // IssueTicket
    public Optional<IssueTicket> getIssueTicket(@NonNull IssueTicketId ticketId) {
        return issueTickets.stream()
                    .filter(e -> e.id().equals(ticketId))
                    .findFirst();
    }
}
