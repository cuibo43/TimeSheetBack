package com.bfs.smarttimesheet.service.impl;

import com.bfs.smarttimesheet.dao.UserDao;
import com.bfs.smarttimesheet.dao.WeeklySummaryDao;
import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserDao userDao;
  @Autowired private WeeklySummaryDao weeklySummaryDao;

  @Override
  public List<WeeklySummary> getAllSummaries(String username) {
    Optional<User> opt = userDao.findByUsername(username);

    if ("admin".equalsIgnoreCase(opt.get().getRole())) {
      return weeklySummaryDao.findAll();
    } else {
      return weeklySummaryDao.findAllByUsernameOrderByEndingDateDesc(username);
    }
  }
}
