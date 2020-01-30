package com.bfs.smarttimesheet.domain;

import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Document(collection = "User")
public class User implements Serializable {
  @Id
  @ApiModelProperty(notes = "User login username - it is unique")
  private String username;

  @ApiModelProperty(notes = "User phone number")
  private String phoneNumber;

  @ApiModelProperty(notes = "Email address of the User")
  private String email;

  @ApiModelProperty(notes = "User address")
  private String address;

  @ApiModelProperty(notes = "Contact field 1")
  private String contact1;

  @ApiModelProperty(notes = "Contact field 2")
  private String contact2;

  @ApiModelProperty(notes = "User avatar path")
  private String avatar;

  @ApiModelProperty(notes = "User role")
  private String role;

  @ApiModelProperty(notes = "Time sheet attachment path")
  private String attachment;
}
