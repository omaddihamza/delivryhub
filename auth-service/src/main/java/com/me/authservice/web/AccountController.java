package com.me.authservice.web;

import com.me.authservice.entities.AppRole;
import com.me.authservice.entities.AppUser;
import com.me.authservice.service.IAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/account")
    public AppUser addAccount(@RequestBody AppUser appUser) {
        return accountService.addAccount(appUser);
    }

    @PostMapping("/role")
    public AppRole addRole(@RequestBody AppRole appRole) {
        return accountService.addRole(appRole);
    }

    @PostMapping("/add-role")
    public void addRoleToUser(@RequestParam String username,@RequestParam String roleName) {
        accountService.addRoleToUser(username, roleName);
    }

    @GetMapping("account/{username}")
    public AppUser loadUserByUsername(@PathVariable String username) {
        return accountService.loadUserByUsername(username);
    }

    @GetMapping("accounts")
    public List<AppUser> listUsers() {
        return accountService.listUsers();
    }
}
