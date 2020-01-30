package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
  @GetMapping("/summary")
  public List<WeeklySummary> getAllSummaries() {
    return null;
  }
}
