package com.bfs.smarttimesheet.dao;

import com.bfs.smarttimesheet.domain.WeeklySummary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeeklySummaryDao extends MongoRepository<WeeklySummary, String> {}
