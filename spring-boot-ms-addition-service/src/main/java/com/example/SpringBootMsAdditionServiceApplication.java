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
public class SpringBootMsAdditionServiceApplication {
	
	protected Logger logger = Logger.getLogger(SpringBootMsAdditionServiceApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsAdditionServiceApplication.class, args);
	}

}
