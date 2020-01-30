package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
import com.bfs.smarttimesheet.service.UserService;
import com.bfs.smarttimesheet.service.WeeklySummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/summary")
public class WeeklySummaryController {
  private WeeklySummaryService weeklySummaryService;
  private UserService userService;

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @Autowired
  public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService) {
    this.weeklySummaryService = weeklySummaryService;
  }

  @PostMapping("/vacationLeft")
  public YearlyVacation getMessage(@RequestBody WeeklySummary ws) {
    return this.weeklySummaryService.vacationLeft(ws.getYear());
  }

  @GetMapping("/all")
  public List<WeeklySummary> getAllSummaries() {
    // hardcode username, needs to replace
    return userService.getAllSummaries("James");
  }
}
