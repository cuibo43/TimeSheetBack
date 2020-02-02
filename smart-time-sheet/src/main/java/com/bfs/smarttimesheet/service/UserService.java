package com.bfs.smarttimesheet.service;

import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.domain.WeeklySummary;

import java.util.List;
import java.util.Optional;

public interface UserService {
  List<WeeklySummary> getAllSummaries(String username);
  Optional<User> getUserInfo(String username);
}
