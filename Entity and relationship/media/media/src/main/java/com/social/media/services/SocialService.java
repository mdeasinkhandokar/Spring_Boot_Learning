package com.social.media.services;

import com.social.media.models.SocialUser;

import java.util.List;

public class SocialService {
    public List<SocialUser> getAllUsers() {return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {return socialUserRepository.save(socialUser);
    }
}
