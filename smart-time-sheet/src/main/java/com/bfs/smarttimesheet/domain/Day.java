package com.bfs.smarttimesheet.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Day {
  @ApiModelProperty(notes = "Date of the day")
  private Timestamp date;

  @ApiModelProperty(notes = "Starting time of daily shift")
  private Timestamp startingTime;

  @ApiModelProperty(notes = "Ending time of daily shift")
  private Timestamp endingTime;

  @ApiModelProperty(notes = "Total hours of the day")
  private Double totalHours;

  @ApiModelProperty(notes = "Whether is the day a floating day")
  private Boolean floatingDay;

  @ApiModelProperty(notes = "Whether is the day a holiday")
  private Boolean holiday;

  @ApiModelProperty(notes = "Whether is the day a vacation")
  private Boolean vacation;
}
