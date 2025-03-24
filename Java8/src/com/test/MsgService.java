package com.test;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int userid = sc.nextInt();

		/*
		 * User u = new User(); String userName = u.getUsernameById(userid); String msg
		 * = userName.toUpperCase() + ", Hello"; System.out.println(msg);
		 */
		User u = new User();
		Optional<String> username = u.getName(userid);

		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + ",Hello");
		} else {
			System.out.println("No Data Found");
		}

	}

}
