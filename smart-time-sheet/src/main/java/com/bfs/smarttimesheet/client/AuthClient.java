package com.bfs.smarttimesheet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "auth")
public interface AuthClient {

  @RequestMapping(method = RequestMethod.POST, value = "/auth")
  ResponseEntity<String> getMessage(@RequestHeader("Authorization") String token);
}
