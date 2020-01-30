package com.bfs.smarttimesheet;

import com.bfs.smarttimesheet.dao.UserDao;
import com.bfs.smarttimesheet.dao.WeeklySummaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

  @Autowired private UserDao userDao;

  @Autowired private WeeklySummaryDao weeklySummaryDao;

  @Override
  public void run(String... args) throws Exception {
    //    userDao.deleteAll();
    //    weeklySummaryDao.deleteAll();
    //    userDao.save(
    //        User.builder()
    //            .username("James")
    //            .phoneNumber("1234567890")
    //            .email("cuibo43@gmail.com")
    //            .address("75 Tennyson Rd")
    //            .contact1("David")
    //            .contact2("Lambert")
    //            .avatar("Happy Face")
    //            .role("admin")
    //            .build());
    //    userDao.save(
    //        User.builder()
    //            .username("David")
    //            .phoneNumber("1234567890")
    //            .email("davidGuo@gmail.com")
    //            .address("75 Tennyson Rd")
    //            .contact1("James")
    //            .contact2("Lambert")
    //            .avatar("Happy Face")
    //            .role("Team Developer")
    //            .build());
    //    userDao.save(
    //        User.builder()
    //            .username("Lambert")
    //            .phoneNumber("1234567890")
    //            .email("linyan.work@gmail.com")
    //            .address("75 Tennyson Rd")
    //            .contact1("David")
    //            .contact2("James")
    //            .avatar("Happy Face")
    //            .role("Team Developer")
    //            .build());
    //
    //    List<Day> days = new ArrayList<>();
    //    Day monday = new Day();
    //    monday.setDate(LocalDate.now());
    //    monday.setStartingTime(LocalTime.now());
    //    monday.setEndingTime(LocalTime.now());
    //    monday.setFloatingDay(false);
    //    monday.setHoliday(false);
    //    monday.setVacation(false);
    //
    //    Day tuesday = new Day();
    //    tuesday.setDate(LocalDate.now());
    //    tuesday.setStartingTime(LocalTime.now());
    //    tuesday.setEndingTime(LocalTime.now());
    //    tuesday.setFloatingDay(false);
    //    tuesday.setHoliday(false);
    //    tuesday.setVacation(false);
    //
    //    days.add(monday);
    //    days.add(tuesday);
    //
    //    weeklySummaryDao.save(
    //        WeeklySummary.builder()
    //            .username("James")
    //            .endingDate(LocalDate.now())
    //            .totalHours(30.00)
    //            .submissionStatus("Completed")
    //            .approvalStatus("N/A")
    //            .comment("N/A")
    //            .year(2019)
    //            .days(days)
    //            .build());
    //
    //    weeklySummaryDao.save(
    //        WeeklySummary.builder()
    //            .username("David")
    //            .endingDate(LocalDate.of(2019, 11, 01))
    //            .totalHours(30.00)
    //            .submissionStatus("Completed")
    //            .approvalStatus("N/A")
    //            .comment("N/A")
    //            .year(2018)
    //            .days(days)
    //            .build());
    //
    //    weeklySummaryDao.save(
    //        WeeklySummary.builder()
    //            .username("David")
    //            .endingDate(LocalDate.of(2019, 10, 01))
    //            .totalHours(30.00)
    //            .submissionStatus("Completed")
    //            .approvalStatus("N/A")
    //            .comment("N/A")
    //            .year(2018)
    //            .days(days)
    //            .build());
    //
    //    System.out.println("User found with findAll():");
    //    System.out.println("-------------------------------");
    //    for (User user : userDao.findAll()) {
    //      System.out.println(user);
    //    }
    //    System.out.println("\n");
    //
    //    // fetch an individual customer
    //    System.out.println("User found with findByUsername('James'):");
    //    System.out.println("--------------------------------");
    //    System.out.println(userDao.findByUsername("James").orElse(null));
    //    System.out.println("\n");
    //
    //    for (WeeklySummary summary : weeklySummaryDao.findAllByUsername("James")) {
    //      System.out.println(summary);
    //    }
    //    System.out.println("--------------------------------\n");
    //    for (WeeklySummary summary : weeklySummaryDao.findTop5ByOrderByEndingDate()) {
    //      System.out.println(summary);
    //    }
    //    System.out.println("--------------------------------\n");
    //    for (WeeklySummary summary : weeklySummaryDao.findAllByYearOrderByEndingDate(2018)) {
    //      System.out.println(summary);
    //    }
  }
}
