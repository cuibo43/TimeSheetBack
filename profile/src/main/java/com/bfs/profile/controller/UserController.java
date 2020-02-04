package com.bfs.profile.controller;

import com.bfs.profile.client.AuthClient;
import com.bfs.profile.domain.User;
import com.bfs.profile.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/profile")
@Api(value = "User Controller")
public class UserController {
    private UserService userService;
    @Autowired
    private AuthClient authClient;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/detail")
    @ApiOperation(value = "Get user information detail", response = User.class)
    public Optional<User> getUserInfo(@RequestHeader("Authorization") String token) {
        try {
            String userName = authClient.getMessage(token).getBody();
            return userService.getUserInfo(userName);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @PostMapping("/updateDetail")
    @ApiOperation(value = "Save user information detail", response = ResponseEntity.class)
    public ResponseEntity<String> saveUserInfo(
            @RequestBody User user, @RequestHeader("Authorization") String token) {
        try {
            authClient.getMessage(token).getBody();
            userService.saveUserInfo(user);
            return ResponseEntity.ok("Successfully Update");
        } catch (Exception e) {
            return ResponseEntity.ok("Fail");
        }
    }
}
