package com.bfs.smarttimesheet.service;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;

import java.time.LocalDate;

public interface WeeklySummaryService {
  YearlyVacation vacationLeft(String userName, Integer year);

  void updateWeeklySummary(WeeklySummary weeklySummary);

  WeeklySummary getWeeklySummaryByUsernameAndEndingDate(String username, LocalDate endingDate);
}
