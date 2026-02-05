package com.example.RestApi_User_Service.controllers;


import com.example.RestApi_User_Service.models.UserRequest;
import com.example.RestApi_User_Service.models.UserResponse;
import com.example.RestApi_User_Service.service.UserService;
import com.example.RestApi_User_Service.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(UserRequest userRequest){
//        System.out.println(userRequest);
        User user=  userService.saveUser(userRequest);
        UserResponse userResponse= new UserResponse(user.getId(), user.getName(),user.getEmail());
         return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUser(){

        List<UserResponse>userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);

    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<List<UserResponse>>getAllUsers(@PathVariable long id){
      userService.deleteUserById(id);
        return ResponseEntity.ok(userList);
    }





}
