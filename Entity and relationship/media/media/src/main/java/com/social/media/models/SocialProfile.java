package com.social.media.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne
//    @JoinColumn(name="social_user")
//    private SocialUser user;

    @OneToOne
    @JoinColumn(name="social_user")
//    @JoinColumn(name="social_profile_id")
    private SocialProfile user ;

    @OneToMany
    private List<Post> posts = new ArrayList<>();

}
