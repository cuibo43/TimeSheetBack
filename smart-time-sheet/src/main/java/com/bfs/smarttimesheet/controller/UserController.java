package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.client.AuthClient;
import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/summary")
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
      return null;
    }
  }
}
