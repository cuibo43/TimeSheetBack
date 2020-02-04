package com.bfs.profile.service.impl;

import com.bfs.profile.dao.UserDao;
import com.bfs.profile.domain.User;
import com.bfs.profile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserDao userDao;

  @Override
  public Optional<User> getUserInfo(String username) {
    return userDao.findByUsername(username);
  }

  @Override
  public void saveUserInfo(User user) {
    userDao.save(user);
  }
}
