package com.birichani_codes.Entities.Security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Project_name: Internet-Banking
 * Entity_name: Authority
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:06
 */

public class Authority implements GrantedAuthority {
    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}

