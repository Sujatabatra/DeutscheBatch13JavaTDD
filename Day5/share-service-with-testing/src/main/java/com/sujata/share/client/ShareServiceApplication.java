package com.sujata.share.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.sujata.share")
@EntityScan(basePackages = "com.sujata.share.entity")
@EnableJpaRepositories(basePackages = "com.sujata.share.persistence")
public class ShareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareServiceApplication.class, args);
	}

}
