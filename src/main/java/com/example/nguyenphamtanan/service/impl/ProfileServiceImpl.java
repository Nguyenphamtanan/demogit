package com.example.nguyenphamtanan.service.impl;

import com.example.nguyenphamtanan.dto.ProfileResponse;
import com.example.nguyenphamtanan.dto.ProjectResponse;
import com.example.nguyenphamtanan.service.ProfileService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Override
    public ProfileResponse getProfile() {

        List<String> skills = Arrays.asList(
                "Java",
                "Spring Boot",
                "SQL Server",
                "HTML/CSS",
                "Docker"
        );

        List<ProjectResponse> projects = Arrays.asList(
                new ProjectResponse(
                        "Website bán xe",
                        "Xây dựng website bán xe bằng Spring Boot"
                ),
                new ProjectResponse(
                        "Website Tinder clone",
                        "Đồ án công nghệ phần mềm"
                ),
                new ProjectResponse(
                        "Portfolio cá nhân",
                        "Trang giới thiệu bản thân"
                )
        );

        return new ProfileResponse(
                "Nguyen Pham Tan An",
                "Java Backend Developer",
                "Sinh viên CNTT đang học Spring Boot và Docker",
                "an@gmail.com",
                "0123456789",
                "Vietnam",
                skills,
                projects
        );
    }
}