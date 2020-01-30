package com.bfs.smarttimesheet;

import com.bfs.smarttimesheet.dao.UserDao;
import com.bfs.smarttimesheet.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

  @Autowired private UserDao userDao;

  @Override
  public void run(String... args) throws Exception {
    userDao.deleteAll();
    userDao.save(
        User.builder()
            .username("James")
            .phoneNumber("1234567890")
            .email("cuibo43@gmail.com")
            .address("75 Tennyson Rd")
            .contact1("David")
            .contact2("Lambert")
            .avatar("Happy Face")
            .role("Team Leader")
            .build());
    userDao.save(
        User.builder()
            .username("David")
            .phoneNumber("1234567890")
            .email("davidGuo@gmail.com")
            .address("75 Tennyson Rd")
            .contact1("James")
            .contact2("Lambert")
            .avatar("Happy Face")
            .role("Team Developer")
            .build());
    userDao.save(
        User.builder()
            .username("Lambert")
            .phoneNumber("1234567890")
            .email("linyan.work@gmail.com")
            .address("75 Tennyson Rd")
            .contact1("David")
            .contact2("James")
            .avatar("Happy Face")
            .role("Team Developer")
            .build());

    System.out.println("User found with findAll():");
    System.out.println("-------------------------------");
    for (User user : userDao.findAll()) {
      System.out.println(user);
    }
    System.out.println("\n");

    // fetch an individual customer
    System.out.println("User found with findByUsername('James'):");
    System.out.println("--------------------------------");
    System.out.println(userDao.findByUsername("James").orElse(null));
    System.out.println("\n");
  }
}
