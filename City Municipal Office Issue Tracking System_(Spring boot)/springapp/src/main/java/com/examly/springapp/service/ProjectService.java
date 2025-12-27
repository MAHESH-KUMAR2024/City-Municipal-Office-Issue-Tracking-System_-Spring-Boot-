package com.examly.springapp.service;

import com.examly.springapp.model.Project;
import com.examly.springapp.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepo.findById(id).orElse(null);
    }

    public Project updateProject(Long id, Project project) {
        if (projectRepo.existsById(id)) {
            project.setId(id);
            return projectRepo.save(project);
        }
        return null;
    }

    public List<Project> getProjectsByStatus(String status) {
        return projectRepo.findByStatus(status);
    }
}
