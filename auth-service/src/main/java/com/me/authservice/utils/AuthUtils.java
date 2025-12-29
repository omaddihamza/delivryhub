package com.me.authservice.utils;

import com.me.authservice.entities.AppUser;
import com.me.authservice.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthUtils {
    private final AppUserRepository appUserRepository;

    public AppUser getCurrentUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return appUserRepository.findByUsername(username);
    }
}
