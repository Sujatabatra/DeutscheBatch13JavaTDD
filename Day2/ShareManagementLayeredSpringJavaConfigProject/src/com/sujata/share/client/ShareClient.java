package com.sujata.share.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.share.config.ShareConfig;
import com.sujata.share.presentation.SharePresentation;
import com.sujata.share.presentation.SharePresentationImpl;

public class ShareClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(ShareConfig.class);
		
		SharePresentation sharePresentation=(SharePresentation)springContainer.getBean("sharePresentation");
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
		}

	}

}
