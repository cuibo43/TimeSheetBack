package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
import com.bfs.smarttimesheet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
@Api(value = "User Controller")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/detail")
    @ApiOperation(value = "Get user information detail", response = Iterable.class)
    public Optional<User> getUserInfo() {
        return userService.getUserInfo("David");
    }
}
