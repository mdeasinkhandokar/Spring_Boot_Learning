package com.social.media.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialGroup {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Set<SocialUser> socialUsers= new HashSet<>();


    @Override
    public int hashCode(){return Objects.hash(id);}

    public Calendar getSocialUsers() {
        return null;
    }
}
