package com.example.smartcomposite.client;

import com.example.smartcomposite.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "profile")
public interface profileClient {

  @RequestMapping(method = RequestMethod.POST, value = "/profile/detail")
  Optional<User> getUserInfo(@RequestHeader("Authorization") String token);
}
