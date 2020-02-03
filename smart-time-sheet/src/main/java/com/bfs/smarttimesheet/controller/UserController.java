//package com.bfs.smarttimesheet.controller;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// import java.util.Optional;
//
// @RestController
// @RequestMapping("/summary")
// @Api(value = "User Controller")
// public class UserController {
//  private UserService userService;
//  @Autowired
//  private AuthClient authClient;
//
//  @Autowired
//  public void setUserService(UserService userService) {
//    this.userService = userService;
//  }
//
//  @PostMapping("/detail")
//  @ApiOperation(value = "Get user information detail", response = User.class)
//  public Optional<User> getUserInfo(@RequestHeader("Authorization") String token) {
//    try {
//      String userName = authClient.getMessage(token).getBody();
//      return userService.getUserInfo(userName);
//    } catch (Exception e) {
//      return null;
//    }
//  }
// }
