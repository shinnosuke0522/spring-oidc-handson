package com.example.issuemanager.api.app.domain.project;

import com.example.issuemanager.api.app.domain.user.UserId;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
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
import org.hibernate.annotations.Immutable;

import java.util.UUID;

@Entity
@Table(name = "member")
@Immutable
@Getter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @Setter(AccessLevel.PACKAGE)
    private Project project;

    @NonNull
    @Embedded
    private UserId userId;

    @With
    @NonNull
    @Enumerated(value = EnumType.STRING)
    private MemberRole role;

    public Member(UserId userId, MemberRole role) {
        this(UUID.randomUUID(), null, userId, role);
    }
}
