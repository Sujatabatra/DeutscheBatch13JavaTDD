package com.sujata.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppApplication.class, args);
	}

}
