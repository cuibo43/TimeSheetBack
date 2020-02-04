package com.example.smartcomposite.client;

import com.example.smartcomposite.domain.WeeklySummary;
import com.example.smartcomposite.domain.YearlyVacation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "smart-time-sheet")
public interface smartClient {

  @RequestMapping(method = RequestMethod.POST, value = "/summary/auth")
  ResponseEntity<String> getMessage(@RequestHeader("Authorization") String token);

  @RequestMapping(method = RequestMethod.POST, value = "/summary/getSummary")
  WeeklySummary getWeeklySummaryById(
      @RequestBody LocalDate endTime, @RequestHeader("Authorization") String token);

  @RequestMapping(method = RequestMethod.POST, value = "/summary/updateSummary")
  ResponseEntity<String> UpdateWeeklySummary(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token);

  @RequestMapping(method = RequestMethod.POST, value = "/summary/vacationLeft")
  YearlyVacation getAvailableVacation(
      @RequestBody WeeklySummary weeklySummary, @RequestHeader("Authorization") String token);

  @RequestMapping(method = RequestMethod.POST, value = "/summary/all")
  List<WeeklySummary> getAllSummaries(@RequestHeader("Authorization") String token);
}
