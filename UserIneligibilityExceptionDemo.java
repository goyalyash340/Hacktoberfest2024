package com.exceptionHandlingExample.day4;

import java.util.Scanner;

public class UserIneligibilityExceptionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IneligibleUserException, OldageUserException {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age<20) {
			throw new IneligibleUserException(age);
		}
		else if(age>70){
			throw new OldageUserException(age);
		}
		else {
			System.out.println("Welcome to the Dashboard");
		}
	}

}
