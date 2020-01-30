package com.bfs.smarttimesheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmartTimeSheetApplication {

  public static void main(String[] args) {
    SpringApplication.run(SmartTimeSheetApplication.class, args);
  }
}
