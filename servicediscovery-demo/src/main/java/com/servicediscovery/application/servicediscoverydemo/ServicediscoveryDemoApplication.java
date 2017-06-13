package com.servicediscovery.application.servicediscoverydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicediscoveryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicediscoveryDemoApplication.class, args);
	}
}
