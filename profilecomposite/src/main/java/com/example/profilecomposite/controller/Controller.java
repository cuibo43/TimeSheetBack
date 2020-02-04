package com.example.profilecomposite.controller;

import com.example.profilecomposite.client.profileClient;
import com.example.profilecomposite.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/profileComposite")
public class Controller {

    @Autowired
    private profileClient profileClient;

    @PostMapping("/detail")
    public Optional<User> getUserInfo(@RequestHeader("Authorization") String token){
        return profileClient.getUserInfo(token);
    }

    @PostMapping("/updateDetail")
    public ResponseEntity<String> saveUserInfo(@RequestBody User user, @RequestHeader("Authorization") String token){
        return profileClient.saveUserInfo(user,token);
    }

}
