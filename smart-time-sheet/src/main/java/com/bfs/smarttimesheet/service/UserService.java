package com.bfs.smarttimesheet.service;

import com.bfs.smarttimesheet.domain.WeeklySummary;

import java.util.List;

public interface UserService {
  List<WeeklySummary> getAllSummaries(String username);
}
