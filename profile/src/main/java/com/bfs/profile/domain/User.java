package com.bfs.profile.domain;

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

    @ApiModelProperty(notes = "Contact 1 first name")
    private String contact1FirstName;

    @ApiModelProperty(notes = "Contact 1 last name")
    private String contact1LastName;

    @ApiModelProperty(notes = "Contact 1 phone number")
    private String contact1PhoneNumber;

    @ApiModelProperty(notes = "Contact 2 first name")
    private String contact2FirstName;

    @ApiModelProperty(notes = "Contact 2 last name")
    private String contact2LastName;

    @ApiModelProperty(notes = "Contact 2 phone number")
    private String contact2PhoneNumber;

    @ApiModelProperty(notes = "User avatar path")
    private String avatar;

    @ApiModelProperty(notes = "User role")
    private String role;

    @ApiModelProperty(notes = "Time sheet attachment path")
    private String attachment;
}
