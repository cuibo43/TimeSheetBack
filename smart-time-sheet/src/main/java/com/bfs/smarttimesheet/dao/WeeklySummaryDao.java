package com.bfs.smarttimesheet.dao;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface WeeklySummaryDao extends MongoRepository<WeeklySummary, String> {

  List<WeeklySummary> findAll();


  List<WeeklySummary> findAllByUsernameAndYear(String username, Integer year);

  List<WeeklySummary> findAllByUsernameOrderByEndingDateDesc(String username);

  Optional<WeeklySummary> findByUsernameAndEndingDate(String username, LocalDate endingDate);
}
