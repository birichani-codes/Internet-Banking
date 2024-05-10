package com.birichani_codes.Repository;

import com.birichani_codes.Entities.Security.PasswordResetToken;
import com.birichani_codes.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.stream.Stream;

/**
 * Project_name: Internet-Banking
 * Entity_name: PasswordResetTokenRepository
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 9 May 2024
 * Time: 21:45
 */

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    PasswordResetToken findByToken(String token);

    PasswordResetToken findByUser(User user);

    Stream<PasswordResetToken> findAllByExpiryDateLessThan(Date now);

    @Modifying
    @Query("delete from PasswordResetToken t where t.expiryDate <= ?1")
    void deleteAllExpiredSince(Date now);
}

