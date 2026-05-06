package com.workintech.fswebs17d1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Value("${course.name}")
    private String couseName;

    @Value("${project.developer.fullname}")
    private String projectDeveloperFullName;


    public CourseController(String projectDeveloperFullName, String couseName) {
        this.projectDeveloperFullName = projectDeveloperFullName;
        this.couseName = couseName;
    }

    public String getCouseName() {
        return couseName;
    }

    public String getProjectDeveloperFullName() {
        return projectDeveloperFullName;
    }

    public void setCouseName(String couseName) {
        this.couseName = couseName;
    }

    public void setProjectDeveloperFullName(String projectDeveloperFullName) {
        this.projectDeveloperFullName = projectDeveloperFullName;
    }
}
