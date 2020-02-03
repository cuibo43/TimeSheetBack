package com.bfs.profile.service;

import com.bfs.profile.domain.User;

import java.util.Optional;

public interface UserService {
//    List<WeeklySummary> getAllSummaries(String username);

    Optional<User> getUserInfo(String username);

  void saveUserInfo(User user);
}
