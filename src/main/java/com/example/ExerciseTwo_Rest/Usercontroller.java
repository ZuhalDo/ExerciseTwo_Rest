package com.example.ExerciseTwo_Rest;

import com.example.ExerciseTwo_Rest.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @PostMapping("/users")
    public void printData(@RequestBody User user){
        System.out.println("Print the user data:" +user);
    }
}
