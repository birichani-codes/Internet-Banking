package com.birichani_codes.serviceImpl;

import com.birichani_codes.Entities.Security.PasswordResetToken;
import com.birichani_codes.Entities.Security.UserRole;
import com.birichani_codes.Entities.User;
import com.birichani_codes.Repository.PasswordResetTokenRepository;
import com.birichani_codes.Repository.RoleRepository;
import com.birichani_codes.Repository.UserRepository;
import com.birichani_codes.Service.UserService;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.logging.Logger;

/**
 * Project_name: Internet-Banking
 * Entity_name: UserServiceImpl
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:16
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(final String token) {
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override
    public void createPasswordResetTokenForUser(final User user, final String token) {
        final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(myToken);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(()->new NullPointerException("User"+id +"Not found."));
    }

    @Override
    public User findByEmail (String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public User createUser(User user, Set<UserRole> userRoles){
        User localUser = userRepository.findByUsername(user.getUsername());

        if(localUser != null) {
            LOG.info("user {} already exists. Nothing will be done.");
        } else {
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

            localUser = userRepository.save(user);
        }

        return localUser;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


}

