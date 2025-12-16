package com.me.authservice.service;

import com.me.authservice.entities.AppRole;
import com.me.authservice.entities.AppUser;

import java.util.List;

public interface IAccountService {
    AppUser addAccount(AppUser appUser);
    AppRole addRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
