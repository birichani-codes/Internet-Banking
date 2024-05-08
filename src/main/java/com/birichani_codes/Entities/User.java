package com.birichani_codes.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Project_name: Internet-Banking
 * Entity_name: User
 * Author: @birichani_codes
 * IDE: IntelliJ IDEA
 * Date: 8 May 2024
 * Time: 02:41
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;

    @Column(name = "id_number", nullable = false, unique = true)
    private String idNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_name")
    private Branch branchName;
    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "address")
    private String address;

}
enum Branch {
    MALINDI, UKUNDA,MIGORI,MWEA,UTAWALA,THIKA,GATEWAY
}

