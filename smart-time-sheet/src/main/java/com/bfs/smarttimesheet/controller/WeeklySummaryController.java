package com.bfs.smarttimesheet.controller;

import com.bfs.smarttimesheet.client.AuthClient;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
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

  @Autowired private AuthClient authClient;

  @Autowired
  public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService) {
    this.weeklySummaryService = weeklySummaryService;
  }

  @PostMapping("/getSummary")
  @ApiOperation(value = "Get Weekly Summary By Id", response = WeeklySummary.class)
  public WeeklySummary getWeeklySummaryById(
      @RequestBody LocalDate endTime, @RequestHeader("Authorization") String token) {
    try {
      String userName = authClient.getMessage(token).getBody();
      return weeklySummaryService.getWeeklySummaryByUsernameAndEndingDate(userName, endTime);
    } catch (Exception e) {
      return null;
    }
  }

  @PostMapping("/updateSummary")
  @ApiOperation(value = "Update Weekly Summary", response = ResponseEntity.class)
  public ResponseEntity<String> UpdateWeeklySummary(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token) {
    try {
      authClient.getMessage(token).getBody();
      weeklySummaryService.updateWeeklySummary(weeklySummary);
      return ResponseEntity.ok("Successfully Update");
    } catch (Exception e) {
      return ResponseEntity.ok("Fail");
    }
  }

  @PostMapping("/vacationLeft")
  @ApiOperation(value = "Get available vacation left", response = YearlyVacation.class)
  public YearlyVacation getAvailableVacation(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token) {
    try {
      String userName = authClient.getMessage(token).getBody();
      return this.weeklySummaryService.vacationLeft(userName, weeklySummary.getYear());
    } catch (Exception e) {
      return null;
    }
  }

  //  @PostMapping("/all")
  //  @ApiOperation(value = "List all weekly summaries", response = Iterable.class)
  //  public List<WeeklySummary> getAllSummaries(@RequestHeader("Authorization") String token) {
  //    try {
  //      String userName = authClient.getMessage(token).getBody();
  //      return weeklySummaryService.getAllSummaries(userName);
  //    } catch (Exception e) {
  //      return null;
  //    }
  //  }

  @PostMapping("/all")
  @ApiOperation(value = "List all weekly summaries", response = Iterable.class)
  public List<WeeklySummary> getAllSummaries(@RequestParam("userName") String userName) {
    return weeklySummaryService.getAllSummaries(userName);
  }

  @PostMapping("/admin")
  @ApiOperation(value = "List all summaries", response = Iterable.class)
  public List<WeeklySummary> getAdminSummaries() {
    return weeklySummaryService.getAdminSummaries();
  }
}
