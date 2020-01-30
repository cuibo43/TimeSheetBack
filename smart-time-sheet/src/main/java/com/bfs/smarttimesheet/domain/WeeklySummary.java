package com.bfs.smarttimesheet.domain;

import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Document(collection = "WeeklySummary")
public class WeeklySummary {

  @Id
  @ApiModelProperty(notes = "The database generated customer ID")
  private String id;

  @ApiModelProperty(notes = "User login username")
  private String username;

  @ApiModelProperty(notes = "Ending date of the week")
  private String endingDate;

  @ApiModelProperty(notes = "Weekly total hours")
  private Double totalHours;

  @ApiModelProperty(notes = "Submission status")
  private String submissionStatus;

  @ApiModelProperty(notes = "Approval status")
  private String approvalStatus;

  @ApiModelProperty(notes = "Comment on weeky summary")
  private String comment;

  @ApiModelProperty(notes = "Year")
  private Integer year;

  @ApiModelProperty(notes = "Days in the week")
  private List<Day> days;
}
