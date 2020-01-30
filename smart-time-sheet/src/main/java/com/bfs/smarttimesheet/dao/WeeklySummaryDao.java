package com.bfs.smarttimesheet.dao;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WeeklySummaryDao extends MongoRepository<WeeklySummary, String> {
  List<WeeklySummary> findAllByYearOrderByEndingDateDesc(Integer year);

  List<WeeklySummary> findAllByUsername(String username);

  List<WeeklySummary> findTop5ByOrderByEndingDate();
}
