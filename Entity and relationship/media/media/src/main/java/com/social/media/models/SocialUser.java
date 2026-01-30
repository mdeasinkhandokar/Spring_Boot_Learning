package com.social.media.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class SocialUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy="user")
    private SocialProfile socialProfile;

    @OneToMany(mappedBy="socialUser")
    private List<Post> post= new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name="user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="group_id")
    )
    private Set<SocialGroup> groups= new HashSet<>();

    @Override
    public int hashCode(){ return Objects.hash(id);}


    public Calendar getGroups() {
        return null;
    }
}
