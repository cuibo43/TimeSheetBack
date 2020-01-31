package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
import com.bfs.smarttimesheet.service.UserService;
import com.bfs.smarttimesheet.service.WeeklySummaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/summary")
@Api(value = "Weekly Summary Controller")
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

  @PostMapping("/getSummary")
  @ApiOperation(value = "Get Weekly Summary By Id", response = WeeklySummary.class)
  public WeeklySummary getWeeklySummaryById(@RequestBody LocalDate endTime) {
    System.out.println(endTime);
    System.out.println(weeklySummaryService.getWeeklySummaryById("David",endTime));
    return weeklySummaryService.getWeeklySummaryById("David",endTime);
  }

  @PostMapping("/updateSummary")
  @ApiOperation(value = "Update Weekly Summary", response = ResponseEntity.class)
  public ResponseEntity<String> UpdateWeeklySummary(@RequestBody WeeklySummary weeklySummary) {
    weeklySummaryService.updateWeeklySummary(weeklySummary);
    return ResponseEntity.ok("Successfully Update");
  }

  @PostMapping("/vacationLeft")
  @ApiOperation(value = "Get available vacation left", response = YearlyVacation.class)
  public YearlyVacation getAvailableVacation(@RequestBody WeeklySummary weeklySummary) {
    // hardcode username, needs to replace
    return this.weeklySummaryService.vacationLeft("David",weeklySummary.getYear());
  }


  @GetMapping("/all")
  @ApiOperation(value = "List all weekly summaries", response = Iterable.class)
  public List<WeeklySummary> getAllSummaries() {
    // hardcode username, needs to replace
    return userService.getAllSummaries("David");
  }
}
