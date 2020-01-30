package com.bfs.smarttimesheet;

import com.bfs.smarttimesheet.dao.WeeklySummaryDao;
import com.bfs.smarttimesheet.domain.Day;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.service.WeeklySummaryService;
import com.bfs.smarttimesheet.service.impl.WeeklySummaryServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class SmartTimeSheetApplicationTests {
//
//  @Mock private WeeklySummaryDao weeklySummaryDao;
//
//  @InjectMocks private WeeklySummaryService weeklySummaryService = new WeeklySummaryServiceImpl();

//  @Test
//  void contextLoads() {
//    Day day1 = new Day();
//    day1.setFloatingDay(true);
//    day1.setVacation(true);
//    Day day2 = new Day();
//    day2.setFloatingDay(true);
//    day2.setVacation(false);
//    Day day3 = new Day();
//    day3.setFloatingDay(true);
//    day3.setVacation(false);
//    Day day4 = new Day();
//    day4.setFloatingDay(true);
//    day4.setVacation(false);
//    Day day5 = new Day();
//    day5.setFloatingDay(false);
//    day5.setVacation(false);
//    Day day6 = new Day();
//    day6.setFloatingDay(false);
//    day6.setVacation(false);
//    Day day7 = new Day();
//    day7.setFloatingDay(false);
//    day7.setVacation(false);
//    List<Day> dayList = new ArrayList<>();
//    dayList.add(day1);
//    dayList.add(day2);
//    dayList.add(day3);
//    dayList.add(day4);
//    dayList.add(day5);
//    dayList.add(day6);
//    dayList.add(day7);
//
//    WeeklySummary weeklySummary1 = new WeeklySummary();
//    weeklySummary1.setDays(dayList);
//    WeeklySummary weeklySummary2 = new WeeklySummary();
//    weeklySummary2.setDays(dayList);
//
//    List<WeeklySummary> weeklySummaries = new ArrayList<>();
//    weeklySummaries.add(weeklySummary1);
//    weeklySummaries.add(weeklySummary2);
//    when(weeklySummaryDao.findAllByYearOrderByEndingDate(2019)).thenReturn(weeklySummaries);
//    assertEquals(2, weeklySummaryService.vacationLeft(2019).getFloatingDayLeft());
//    assertEquals(8, weeklySummaryService.vacationLeft(2019).getVacationLeft());
//  }
}
