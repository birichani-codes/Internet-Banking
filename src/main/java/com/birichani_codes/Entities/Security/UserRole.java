package com.birichani_codes.Entities.Security;

import com.birichani_codes.Entities.User;
import jakarta.persistence.*;

/**
 * Project_name: Internet-Banking
 * Entity_name: UserRole
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:09
 */
@Entity
@Table(name="user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="role_id")
    private Role role;

    public UserRole(){}

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }


    public Long getUserRoleId() {
        return userRoleId;
    }


    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }

}

