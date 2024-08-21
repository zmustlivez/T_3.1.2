package ru.kata.spring.boot_security.demo.security;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.demo.model.Role;

public class RoleSecurity implements GrantedAuthority {
    private Role role;

    public RoleSecurity(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getRoleName();
    }
}
