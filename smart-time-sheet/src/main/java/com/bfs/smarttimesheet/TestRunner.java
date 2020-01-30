package com.bfs.smarttimesheet;

import com.bfs.smarttimesheet.dao.UserDao;
import com.bfs.smarttimesheet.dao.WeeklySummaryDao;
import com.bfs.smarttimesheet.domain.Day;
import com.bfs.smarttimesheet.domain.User;
import com.bfs.smarttimesheet.domain.WeeklySummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestRunner implements CommandLineRunner {

  @Autowired private UserDao userDao;

  @Autowired private WeeklySummaryDao weeklySummaryDao;

  @Override
  public void run(String... args) throws Exception {
    userDao.deleteAll();
//    weeklySummaryDao.deleteAll();
    userDao.save(
        User.builder()
            .username("James")
            .phoneNumber("1234567890")
            .email("cuibo43@gmail.com")
            .address("75 Tennyson Rd")
            .contact1FirstName("David")
                .contact1LastName("Guo")
                .contact1PhoneNumber("31283830982")
            .contact2FirstName("Lambert")
                .contact2LastName("Lin")
                .contact2PhoneNumber("1111111111")
            .avatar("Happy Face")

            .role("admin")
            .build());
    userDao.save(
            User.builder()
                    .username("David")
                    .phoneNumber("3128380982")
                    .email("guoshangpeng1995@gmail.com")
                    .address("75 Tennyson Rd")
                    .contact1FirstName("James")
                    .contact1LastName("Cui")
                    .contact1PhoneNumber("2222222222")
                    .contact2FirstName("Lambert")
                    .contact2LastName("Lin")
                    .contact2PhoneNumber("1111111111")
                    .avatar("Happy Face")
                    .role("admin")
                    .build());
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

    List<Day> days = new ArrayList<>();
//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2020, 1, 26));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(16, 0 , 0));
//    monday.setTotalHours(8.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2020, 1, 27));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2020, 1, 28));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,1,29));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(false);
//    four.setVacation(true);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 1, 30));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 1, 31));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 2, 1));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2020, 1, 19));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(16, 0 , 0));
//    monday.setTotalHours(8.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2020, 1, 20));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2020, 1, 21));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,1,22));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(false);
//    four.setVacation(true);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 1, 23));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 1, 24));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 1, 25));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2020, 2, 2));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(18, 0 , 0));
//    monday.setTotalHours(10.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2020, 2, 3));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2020, 2, 4));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,2,5));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(false);
//    four.setVacation(true);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 2, 6));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 2, 7));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 2, 8));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2020, 1, 12));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(18, 0 , 0));
//    monday.setTotalHours(10.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2020, 1, 13));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2020, 1, 14));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,1,15));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(false);
//    four.setVacation(true);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 1, 17));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 1, 16));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 1, 18));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2020, 1, 6));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(18, 0 , 0));
//    monday.setTotalHours(10.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2020, 1, 5));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2020, 1, 9));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,1,10));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(false);
//    four.setVacation(true);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 1, 7));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 1, 8));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 1, 11));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

//    Day monday = new Day();
//    monday.setDate(LocalDate.of(2019, 12, 29));
//    monday.setStartingTime(LocalTime.of(8,0 , 0));
//    monday.setEndingTime(LocalTime.of(18, 0 , 0));
//    monday.setTotalHours(10.0);
//    monday.setFloatingDay(false);
//    monday.setHoliday(false);
//    monday.setVacation(false);
//
//    Day tuesday = new Day();
//    tuesday.setDate(LocalDate.of(2019, 12, 30));
//    tuesday.setStartingTime(null);
//    tuesday.setEndingTime(null);
//    tuesday.setTotalHours(0.0);
//    tuesday.setFloatingDay(true);
//    tuesday.setHoliday(false);
//    tuesday.setVacation(false);
//
//    Day three = new Day();
//    three.setDate(LocalDate.of(2019, 12, 31));
//    three.setStartingTime(null);
//    three.setEndingTime(null);
//    three.setTotalHours(0.0);
//    three.setFloatingDay(false);
//    three.setHoliday(true);
//    three.setVacation(false);
//
//    Day four = new Day();
//    four.setDate(LocalDate.of(2020,1,1));
//    four.setStartingTime(null);
//    four.setEndingTime(null);
//    four.setTotalHours(0.0);
//    four.setFloatingDay(false);
//    four.setHoliday(true);
//    four.setVacation(false);
//
//    Day five = new Day();
//    five.setDate(LocalDate.of(2020, 1, 2));
//    five.setStartingTime(LocalTime.of(9, 0, 0));
//    five.setEndingTime(LocalTime.of(19, 0 ,0));
//    five.setTotalHours(10.0);
//    five.setFloatingDay(false);
//    five.setHoliday(false);
//    five.setVacation(false);
//
//    Day six = new Day();
//    six.setDate(LocalDate.of(2020, 1, 3));
//    six.setStartingTime(LocalTime.of(12, 0 , 0));
//    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
//    six.setTotalHours(4.0);
//    six.setFloatingDay(false);
//    six.setHoliday(false);
//    six.setVacation(false);
//
//    Day seven = new Day();
//    seven.setDate(LocalDate.of(2020, 1, 4));
//    seven.setStartingTime(LocalTime.of(9, 0, 0));
//    seven.setEndingTime(LocalTime.of(17, 0, 0));
//    seven.setTotalHours(8.0);
//    seven.setFloatingDay(false);
//    seven.setHoliday(false);
//    seven.setVacation(false);

    Day monday = new Day();
    monday.setDate(LocalDate.of(2019, 12, 29));
    monday.setStartingTime(LocalTime.of(8,0 , 0));
    monday.setEndingTime(LocalTime.of(18, 0 , 0));
    monday.setTotalHours(10.0);
    monday.setFloatingDay(false);
    monday.setHoliday(false);
    monday.setVacation(false);

    Day tuesday = new Day();
    tuesday.setDate(LocalDate.of(2019, 12, 30));
    tuesday.setStartingTime(null);
    tuesday.setEndingTime(null);
    tuesday.setTotalHours(0.0);
    tuesday.setFloatingDay(true);
    tuesday.setHoliday(false);
    tuesday.setVacation(false);

    Day three = new Day();
    three.setDate(LocalDate.of(2019, 12, 31));
    three.setStartingTime(null);
    three.setEndingTime(null);
    three.setTotalHours(0.0);
    three.setFloatingDay(false);
    three.setHoliday(true);
    three.setVacation(false);

    Day four = new Day();
    four.setDate(LocalDate.of(2020,1,1));
    four.setStartingTime(null);
    four.setEndingTime(null);
    four.setTotalHours(0.0);
    four.setFloatingDay(false);
    four.setHoliday(true);
    four.setVacation(false);

    Day five = new Day();
    five.setDate(LocalDate.of(2020, 1, 2));
    five.setStartingTime(LocalTime.of(9, 0, 0));
    five.setEndingTime(LocalTime.of(19, 0 ,0));
    five.setTotalHours(10.0);
    five.setFloatingDay(false);
    five.setHoliday(false);
    five.setVacation(false);

    Day six = new Day();
    six.setDate(LocalDate.of(2020, 1, 3));
    six.setStartingTime(LocalTime.of(12, 0 , 0));
    six.setEndingTime(LocalTime.of(16, 0 ,0 ));
    six.setTotalHours(4.0);
    six.setFloatingDay(false);
    six.setHoliday(false);
    six.setVacation(false);

    Day seven = new Day();
    seven.setDate(LocalDate.of(2020, 1, 4));
    seven.setStartingTime(LocalTime.of(9, 0, 0));
    seven.setEndingTime(LocalTime.of(17, 0, 0));
    seven.setTotalHours(8.0);
    seven.setFloatingDay(false);
    seven.setHoliday(false);
    seven.setVacation(false);
    days.add(monday);
    days.add(tuesday);
    days.add(three);
    days.add(four);
    days.add(five);
    days.add(six);
    days.add(seven);

//    weeklySummaryDao.save(
//        WeeklySummary.builder()
//            .username("James")
//            .endingDate(LocalDate.of(2020, 1, 4))
//            .totalHours(32.00)
//            .submissionStatus("Complete")
//            .approvalStatus("Approved")
//            .comment("N/A")
//            .year(2020)
//            .days(days)
//            .build());

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


    System.out.println("User found with findAll():");
    System.out.println("-------------------------------");
    for (User user : userDao.findAll()) {
      System.out.println(user);
    }
    System.out.println("\n");

    // fetch an individual customer
    System.out.println("User found with findByUsername('James'):");
    System.out.println("--------------------------------");
    System.out.println(userDao.findByUsername("James").orElse(null));
    System.out.println("\n");

    for (WeeklySummary summary : weeklySummaryDao.findAllByUsername("James")) {
      System.out.println(summary);
    }
    System.out.println("--------------------------------\n");
    for (WeeklySummary summary : weeklySummaryDao.findTop5ByOrderByEndingDate()) {
      System.out.println(summary);
    }
    System.out.println("--------------------------------\n");
    for (WeeklySummary summary : weeklySummaryDao.findAllByYearOrderByEndingDate(2018)) {
      System.out.println(summary);
    }

  }
}
