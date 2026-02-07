package com.example.client.side.restapi.service;


import com.example.client.side.restapi.UserRequest;
import com.example.client.side.restapi.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class UserService {
    RestClient restClient = RestClient.create();

     public UserResponse  getUserById(int id){

             UserResponse userResponse=restClient.get()
                .uri("http://localhost:8080/api/v1/users/1",id)
                .retrieve()
                .body(UserResponse.class);
             return userResponse;
    }


    public UserResponse createUser(UserRequest admin) {
         return null;
    }
}
