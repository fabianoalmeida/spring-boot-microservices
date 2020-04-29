package com.example;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
@SpringBootApplication
public class SpringBootMsSubtractionServiceApplication {

	protected Logger logger = Logger.getLogger(SpringBootMsSubtractionServiceApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsSubtractionServiceApplication.class, args);
	}

}
