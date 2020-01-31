package com.bfs.smarttimesheet.service.impl;

import com.bfs.smarttimesheet.dao.WeeklySummaryDao;
import com.bfs.smarttimesheet.domain.Day;
import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
import com.bfs.smarttimesheet.service.WeeklySummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class WeeklySummaryServiceImpl implements WeeklySummaryService {

  @Autowired private WeeklySummaryDao weeklySummaryDao;

  public YearlyVacation vacationLeft(String userName, Integer year) {
    List<WeeklySummary> weeklySummaryList = weeklySummaryDao.findAllByUsernameAndYear(userName,year);
    YearlyVacation yearlyVacation = new YearlyVacation();
    int vacation = 10;
    int floatingDay = 10;
    for (WeeklySummary ws : weeklySummaryList) {
      for (Day day : ws.getDays()) {
        if (day.getVacation() == true) {
          vacation -= 1;
        }
        if (day.getFloatingDay() == true) {
          floatingDay -= 1;
        }
      }
    }
    yearlyVacation.setFloatingDayLeft(floatingDay);
    yearlyVacation.setVacationLeft(vacation);
    return yearlyVacation;
  }

  public void updateWeeklySummary(WeeklySummary weeklySummary){
    weeklySummaryDao.save(weeklySummary);
  }

  public WeeklySummary getWeeklySummaryById(String useName, LocalDate EndingDate){
    while (!EndingDate.getDayOfWeek().name().equals("SATURDAY")){
      EndingDate=EndingDate.plusDays(1);
    }
    System.out.println(EndingDate);
    Optional<WeeklySummary> ows =weeklySummaryDao.findByUsernameAndEndingDate( useName, EndingDate);
    if(ows.isPresent()){
      return(ows.get());
    }
    else{
      return new WeeklySummary();
    }
  }


}
