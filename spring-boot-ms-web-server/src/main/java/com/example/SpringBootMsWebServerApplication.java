package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.example.controller.HomeController;
import com.example.controller.WebArithmeticController;
import com.example.service.WebAdditionService;
import com.example.service.WebSubtractionService;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class SpringBootMsWebServerApplication {

	public static final String ADDITION_SERVICE_URL = "http://192.168.15.11:8080/addition";
	public static final String SUBTRACTION_SERVICE_URL = "http://192.168.15.11:8080/subtraction";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsWebServerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebAdditionService additionService() {
		return new WebAdditionService(ADDITION_SERVICE_URL);
	}

	@Bean
	public WebSubtractionService subtractionService() {
		return new WebSubtractionService(SUBTRACTION_SERVICE_URL);
	}

	@Bean
	public WebArithmeticController additionController() {
		return new WebArithmeticController(additionService(), subtractionService());
	}

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}

}
