package com.example.nguyenphamtanan.controller;

import com.example.nguyenphamtanan.dto.ProfileResponse;
import com.example.nguyenphamtanan.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/api/profile")
    public ProfileResponse getProfile() {
        return profileService.getProfile();
    }
}