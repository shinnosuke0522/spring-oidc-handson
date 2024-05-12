package com.example.issuemanager.api.app.domain.user;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @EmbeddedId
    private UserId id;

    private String sub;

    private String nickName;
}
