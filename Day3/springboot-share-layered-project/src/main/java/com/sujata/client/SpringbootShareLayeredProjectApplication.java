package com.sujata.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.SharePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootShareLayeredProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootShareLayeredProjectApplication.class, args);

		SharePresentation sharePresentation = (SharePresentation) springContainer.getBean("sharePresentation");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			sharePresentation.performMenu(choice);
		}

	}

}
