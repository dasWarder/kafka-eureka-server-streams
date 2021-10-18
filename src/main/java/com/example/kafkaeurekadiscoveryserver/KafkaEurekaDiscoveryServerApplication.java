package com.example.kafkaeurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KafkaEurekaDiscoveryServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaEurekaDiscoveryServerApplication.class, args);
  }
}
