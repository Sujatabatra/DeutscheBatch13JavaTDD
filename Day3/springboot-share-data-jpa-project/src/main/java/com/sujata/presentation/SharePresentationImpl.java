package com.sujata.presentation;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Share;
import com.sujata.service.ShareService;
import com.sujata.service.ShareServiceImpl;

@Component("sharePresentation")
public class SharePresentationImpl implements SharePresentation {

	@Autowired
	private ShareService shareService;

	@Override
	public void showMenu() {
		System.out.println("============================");
		System.out.println("Share Management System");
		System.out.println("============================");
		System.out.println("1. Show All Shares");
		System.out.println("2. Search Share By ID");
		System.out.println("3. Search Share By Name ");
		System.out.println("4. Exit");
		System.out.println("-----------------------------");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);

		switch (choice) {
		case 1:
			List<Share> shareList = shareService.getAllShares();
			for (Share share : shareList) {
				System.out.println(share);
			}
			break;
		case 2:
			System.out.println("Enter Share ID ");
			int shareId = scanner.nextInt();
			Optional<Share> optionalShare = shareService.getShareById(shareId);

			optionalShare.ifPresentOrElse((sh) -> System.out.println(sh),
					() -> System.out.println("Share with id " + shareId + " does not exist"));

			break;
		case 3:
			System.out.println("Enter Share Name : ");
			String name=scanner.next();
			Optional<Share> opShare=shareService.findShareByName(name);
			
			opShare.ifPresentOrElse((sh) -> System.out.println(sh),
					() -> System.out.println("Share with name " + name + " does not exist"));
			break;
			
		case 4:
			System.out.println("Thanks for using our system, please try us again!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}
