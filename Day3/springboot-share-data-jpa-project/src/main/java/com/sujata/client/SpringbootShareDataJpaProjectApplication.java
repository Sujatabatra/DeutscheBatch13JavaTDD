package com.sujata.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.SharePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootShareDataJpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootShareDataJpaProjectApplication.class, args);
		
		Scanner scanner=new Scanner(System.in);
		
		SharePresentation sharePresentation=(SharePresentation)springContainer.getBean("sharePresentation");
		while(true) {
		
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
			
		}
	}

}
