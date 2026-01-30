package com.social.media.models;


import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long id;


    @ManyToMany
    @JoinColumn(name="user_id")
    private SocialUser socialUser;


    public void setSocialUser(SocialUser user1) {

    }
}
