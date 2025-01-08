package com.scm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;


@Entity
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length =1000)
    private String description;
    private boolean favorite=false;
    private String websiteLink;
    private String linkedinLink;

    @ManyToOne
    private Users user;

    @OneToMany(mappedBy = "contact",cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
    private List<SocialLink> links = new ArrayList<>();
    
}
