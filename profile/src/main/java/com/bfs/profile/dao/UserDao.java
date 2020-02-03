package com.bfs.profile.dao;

import com.bfs.profile.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserDao extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
