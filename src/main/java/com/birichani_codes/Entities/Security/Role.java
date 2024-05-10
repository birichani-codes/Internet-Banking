package com.birichani_codes.Entities.Security;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

/**
 * Project_name: Internet-Banking
 * Entity_name: Role
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:09
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Role {
    @Id
    private int roleId;
    private String name;

    @OneToMany(mappedBy = "role", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<UserRole> userRoles = new HashSet<>();

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}

