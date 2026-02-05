package com.example.RestApi_User_Service.service;


import com.example.RestApi_User_Service.entity.User;



import com.example.RestApi_User_Service.exception;
import com.example.RestApi_User_Service.exception.ResourceNotFoundException;
import com.example.RestApi_User_Service.models.UserRequest;
import com.example.RestApi_User_Service.models.UserResponse;
import com.example.RestApi_User_Service.repository.UserRepository;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserRequest userRequest) {
        User user = new User(userRequest.name(), userRequest.email());
        User saveUser;
        saveUser = userRepository.save(user);
        return saveUser;


    }

    public UserResponse getUserById(long id) {
        Optional<User> data = userRepository.findById(id);
        User user = null;
        if (data.isPresent()) {
            user = data.get();
        }else{
            throw new ResourceNotFoundException("User with id " + id + " not found");
        }
            UserResponse userResponse = new UserResponse(user.getId(), user.getName(), user.getEmail());
            return userResponse;


        }





    public List<UserResponse> getAllUsers() {

        List<User> allUser = userRepository.findAll();
        List<UserResponse>userResponseList= new ArrayList<>();
        for(User user : allUser){
            userResponseList.add(new UserResponse(user.getId(), user.getName(), user.getEmail()));
        }
        return userResponseList;


    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);




    }
}
