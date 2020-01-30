package com.bfs.smarttimesheet.service;

import com.bfs.smarttimesheet.responseDomain.YearlyVacation;

public interface WeeklySummaryService {
  YearlyVacation vacationLeft(String userName, Integer year);
}
