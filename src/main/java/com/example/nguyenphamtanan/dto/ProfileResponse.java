package com.example.nguyenphamtanan.dto;

import java.util.List;

public class ProfileResponse {
    private String fullName;
    private String title;
    private String bio;
    private String email;
    private String phone;
    private String address;
    private List<String> skills;
    private List<ProjectResponse> projects;

    public ProfileResponse() {
    }

    public ProfileResponse(String fullName, String title, String bio, String email,
                           String phone, String address, List<String> skills,
                           List<ProjectResponse> projects) {
        this.fullName = fullName;
        this.title = title;
        this.bio = bio;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.skills = skills;
        this.projects = projects;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<ProjectResponse> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectResponse> projects) {
        this.projects = projects;
    }
}