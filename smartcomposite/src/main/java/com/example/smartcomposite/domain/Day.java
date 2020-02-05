package com.example.smartcomposite.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Day {
  @ApiModelProperty(notes = "Date of the day")
  private LocalDate date;

  @ApiModelProperty(notes = "Starting time of daily shift")
  private LocalTime startingTime;

  @ApiModelProperty(notes = "Ending time of daily shift")
  private LocalTime endingTime;

  @ApiModelProperty(notes = "Total hours of the day")
  private Double totalHours;

  @ApiModelProperty(notes = "Whether is the day a floating day")
  private Boolean floatingDay;

  @ApiModelProperty(notes = "Whether is the day a holiday")
  private Boolean holiday;

  @ApiModelProperty(notes = "Whether is the day a vacation")
  private Boolean vacation;
}
