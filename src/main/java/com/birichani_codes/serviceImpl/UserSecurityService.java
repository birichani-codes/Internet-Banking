package com.birichani_codes.serviceImpl;

import com.birichani_codes.Entities.User;
import com.birichani_codes.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Project_name: Internet-Banking
 * Entity_name: UserSecurityService
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:19
 */
@Service
public class UserSecurityService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = userRepository.findByUsername(username);

        if(null == user) {
            throw new UsernameNotFoundException("Username not found");
        }

        return user;
    }
}

