package com.example.profilecomposite.client;

import com.example.profilecomposite.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient(name = "profile")
public interface profileClient {

  @RequestMapping(method = RequestMethod.POST, value = "/profile/detail")
  Optional<User> getUserInfo(@RequestHeader("Authorization") String token);

  @RequestMapping(method = RequestMethod.POST, value = "/profile/updateDetail")
  ResponseEntity<String> saveUserInfo(
      @RequestBody User user, @RequestHeader("Authorization") String token);
}
