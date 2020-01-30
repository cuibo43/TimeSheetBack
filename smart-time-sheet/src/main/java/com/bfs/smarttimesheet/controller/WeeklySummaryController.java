package com.bfs.smarttimesheet.controller;


import com.bfs.smarttimesheet.domain.WeeklySummary;
import com.bfs.smarttimesheet.responseDomain.YearlyVacation;
import com.bfs.smarttimesheet.service.WeeklySummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/summary")
public class WeeklySummaryController {
    private WeeklySummaryService weeklySummaryService;

    @Autowired
    public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService){
        this.weeklySummaryService = weeklySummaryService;
    }


    @GetMapping("/vacationLeft")
    public YearlyVacation getMessage(@RequestBody WeeklySummary ws) {
        return this.weeklySummaryService.vacationLeft(ws.getYear());
    }
}
