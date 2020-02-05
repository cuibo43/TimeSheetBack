package com.example.smartcomposite.controller;

import com.example.smartcomposite.client.AuthClient;
import com.example.smartcomposite.client.profileClient;
import com.example.smartcomposite.client.smartClient;
import com.example.smartcomposite.domain.WeeklySummary;
import com.example.smartcomposite.domain.YearlyVacation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/smartComposite")
public class Controller {

  @Autowired private smartClient smartClient;

  @Autowired private AuthClient authClient;

  @Autowired private profileClient profileClient;

  @PostMapping("/getSummary")
  public WeeklySummary getWeeklySummaryById(
      @RequestBody LocalDate endTime, @RequestHeader("Authorization") String token) {
    return smartClient.getWeeklySummaryById(endTime, token);
  }

  @PostMapping("/updateSummary")
  public ResponseEntity<String> UpdateWeeklySummary(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token) {
    return smartClient.UpdateWeeklySummary(weeklySummary, token);
  }

  @PostMapping("/vacationLeft")
  public YearlyVacation getAvailableVacation(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token) {
    return smartClient.getAvailableVacation(weeklySummary, token);
  }

  @PostMapping("/all")
  public List<WeeklySummary> getAllSummaries(@RequestHeader("Authorization") String token) {
    String username = authClient.getMessage(token).getBody();
    String role = profileClient.getUserInfo(token).get().getRole();
    if (role.equals("admin")) {
      return smartClient.getAdminSummaries();
    } else {
      return smartClient.getAllSummaries(username);
    }
  }
}
