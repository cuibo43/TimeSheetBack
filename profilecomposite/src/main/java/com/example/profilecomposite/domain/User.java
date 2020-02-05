package com.example.profilecomposite.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User implements Serializable {
  private String username;

  private String phoneNumber;

  private String email;

  private String address;

  private String contact1FirstName;

  private String contact1LastName;

  private String contact1PhoneNumber;

  private String contact2FirstName;

  private String contact2LastName;

  private String contact2PhoneNumber;

  private String avatar;

  private String role;

  private String attachment;
}
