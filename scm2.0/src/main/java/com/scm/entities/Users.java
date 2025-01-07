package com.scm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    @Id
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private String password;

    @Column(length = 1000)
    private String about;

    @Column(name = "profile_pic", length = 500)
    private String profilePic;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(nullable = false)
    private boolean enabled;

    @Column(name = "email_verified", nullable = false)
    private boolean emailVerified;

    @Column(name = "phone_number_verified", nullable = false)
    private boolean phoneNumberVerified;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false)
  
}
