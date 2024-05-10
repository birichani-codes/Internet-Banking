package com.birichani_codes.Models;

import com.birichani_codes.Entities.Branch;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * Project_name: Internet-Banking
 * Entity_name: UserDTO
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 8 May 2024
 * Time: 02:58
 */
@Getter
@Setter
public class UserDTO {
    @NotBlank(message = "username is required")
    private  String username;
    @NotBlank(message = "Account name is required")
    private String accountName;

    @NotBlank(message = "Account number is required")
    private String accountNumber;

    @NotBlank(message = "ID number is required")
    private String idNumber;

    private Branch branch;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Phone number must be 10 digits")
    private String phone;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    private String confirmPassword;
}

