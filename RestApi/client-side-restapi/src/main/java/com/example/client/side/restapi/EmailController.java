package com.example.client.side.restapi;


import com.example.client.side.restapi.service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private UserService userService;

    public EmailController (UserService userService){
        this.userService=userService;
    }



    @GetMapping("/email/welcome/{uersId}")
    public String  sendWelcomeEmail(@PathVariable String userId){
        UserResponse userResponse=userService.getUserById(Integer.parseInt(userId));

        String emailTemplate = """
                Hi %a 
                welcome !
                Your email %s
                Is now registerd 
                
                Thanks you!
              
                """ .formatted(userResponse.name(), userResponse.email());




        return "email sent to user :"+userResponse.email();
    }


    public UserResponse createUser(UserRequest userRequest){
        UserResponse userResponse = restClient
                .post()
                .uri("http: //localhost:8080/api/v1/users")
                .bosy(userRequest)
                .retrieve()
                .bosy(UserResponse.class);

        return userResponse;
    }








}
