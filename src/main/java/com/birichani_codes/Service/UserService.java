package com.birichani_codes.Service;

import com.birichani_codes.Entities.Security.PasswordResetToken;
import com.birichani_codes.Entities.Security.UserRole;
import com.birichani_codes.Entities.User;

import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail (String email);

    User findById(Long id);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
