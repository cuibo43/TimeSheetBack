package com.example.auth.dao;

import com.example.auth.domain.userInformation;

public interface UserDAO {
  userInformation findByUsername(String userName);
}
