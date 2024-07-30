package com.sujata.share.client;

import java.util.Scanner;

import com.sujata.share.presentation.SharePresentation;
import com.sujata.share.presentation.SharePresentationImpl;

public class ShareClient {

	public static void main(String[] args) {
		
		SharePresentation sharePresentation=new SharePresentationImpl();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
		}

	}

}
