package com.example.auth.service;

import com.example.auth.dao.UserDAO;
import com.example.auth.domain.userInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserDetailsService {
  private UserDAO userDAO;

  @Autowired
  public void setUserDAO(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Transactional
  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    return this.userDAO.findByUsername(s);
  }

  @Transactional
  public userInformation getUserByUsername(String s) {
    return this.userDAO.findByUsername(s);
  }
}
