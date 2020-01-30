package com.bfs.smarttimesheet.dao;

import com.bfs.smarttimesheet.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserDao extends MongoRepository<User, String> {
  Optional<User> findByUsername(String username);
  List<User> findAllByRole(String role);
}
