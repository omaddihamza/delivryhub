package com.me.authservice.service;

import com.me.authservice.entities.AppRole;
import com.me.authservice.entities.AppUser;
import com.me.authservice.repository.AppRoleRepository;
import com.me.authservice.repository.AppUserRepository;
import jakarta.persistence.ManyToMany;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class IAccountServiceImpl implements IAccountService {

    private final AppUserRepository appUserRepository;
    private final AppRoleRepository appRoleRepository;

    public IAccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository) {
        this.appUserRepository = appUserRepository;
        this.appRoleRepository = appRoleRepository;
    }

    @Override
    public AppUser addAccount(AppUser appUser) {
        String username = appUser.getUsername();
        AppUser user = appUserRepository.findByUsername(username);
        if (user != null) {
           throw new RuntimeException("User already exists");
        }
        return appUserRepository.save(appUser);
    }

    @Override
    public AppRole addRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser user = appUserRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User introuvable");
        }

        AppRole role = appRoleRepository.findByRoleName(roleName);
        if (role == null) {
            throw new RuntimeException("Rôle introuvable");
        }

        user.getAppRoles().add(role);

        appUserRepository.save(user);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> listUsers() {
        return appUserRepository.findAll();
    }
}
