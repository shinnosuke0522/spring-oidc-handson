package com.example.issuemanager.api.app.domain.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, ProjectId> {
}
