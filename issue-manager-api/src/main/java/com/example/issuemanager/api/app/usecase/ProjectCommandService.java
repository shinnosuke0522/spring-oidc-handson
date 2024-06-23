package com.example.issuemanager.api.app.usecase;

import com.example.issuemanager.api.app.domain.project.Project;
import com.example.issuemanager.api.app.domain.project.ProjectRepository;
import com.example.issuemanager.api.app.usecase.dto.command.ProjectGenerateCommand;
import com.example.issuemanager.api.app.usecase.dto.command.ProjectUpdateCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Transactional
    public void generate(ProjectGenerateCommand command) {
        projectRepository.save(
           Project.init(command.name(), command.operatorId())
        );
    }

    @Transactional
    public void update(ProjectUpdateCommand command) {
        var updateTarget = projectRepository
                .findById(command.projectId())
                .orElseThrow(() -> new IllegalStateException("Project not found with id: " + command.projectId()));
        var updated = updateTarget.updateProject(command.name());
        if (upda)
    }


}
