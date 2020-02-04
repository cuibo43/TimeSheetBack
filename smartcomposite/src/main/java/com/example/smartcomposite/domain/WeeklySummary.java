package com.example.smartcomposite.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class WeeklySummary {
  private String id;

  private String username;

  private LocalDate endingDate;

  private Double totalHours;

  private String submissionStatus;

  private String approvalStatus;

  private String comment;

  private Integer year;

  private List<Day> days;
}
