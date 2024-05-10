package com.birichani_codes.Utility;

import com.birichani_codes.Entities.User;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.thymeleaf.TemplateEngine;

import java.util.Locale;

/**
 * Project_name: Internet-Banking
 * Entity_name: MailConstructor
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 10 May 2024
 * Time: 03:55
 */

public class MailConstructor {
    @Autowired
    private Environment env;

    @Autowired
    private TemplateEngine templateEngine;

    public SimpleMailMessage constructResetTokenEmail(
            String contextPath, Locale locale, String token, User user, String password
    ) {

        String url = contextPath + "/newUser?token="+token;
        String message = "\nPlease click on this link to verify your email and edit your personal information. Your password is: \n"+password;
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("Internet-banking - New User");
        email.setText(url+message);
        email.setFrom(env.getProperty("support.email"));
        return email;

    }

}

