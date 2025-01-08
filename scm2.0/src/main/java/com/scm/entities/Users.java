package com.scm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    // Unique identifier for the user
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    // Full name of the user
    @Column(name = "user_name", nullable = false)
    private String name;

    // Email address of the user (must be unique)
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    // Password for user authentication
    @Column(nullable = false)
    private String password;

    // Brief description about the user
    @Column(length = 500)
    private String about;

    // Profile picture URL (optional)
    @Column(name = "profile_pic", length = 300)
    private String profilePic;

    // User's phone number
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Getter(value = AccessLevel.NONE)
    // Indicates if the user account is enabled
    private boolean enabled = false;
    // Indicates if the user's email is verified
    private boolean emailVerified = false;
    // Indicates if the user's phone number is verified
    private boolean phoneNumberVerified = false;

    // Authentication provider (SELF, GOOGLE, etc.)
    @Enumerated(value = EnumType.STRING)
    // SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    private providers provider = providers.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
    private List<Contact> contacts = new ArrayList<>(); 

    

}
