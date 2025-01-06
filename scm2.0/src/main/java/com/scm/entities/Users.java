package com.scm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Setter; 
import lombok.Getter; 
import lombok.Builder;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@Builder

public class Users {

    @Id
    private String userId;

    @Column(name = "user_name", nullable =false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email; 

    private String password;

    @Column(length =10000)
    private String about;

    @Column(length =10000)
    private String profilePic;

    private String phoneNumber;
    //Informations
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneNumberVerified = false;

    //SELF, GOOGLE, FACEBOOK, GITHUB
    private  providers provider = providers.SELF;

}
