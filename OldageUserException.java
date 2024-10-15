package com.exceptionHandlingExample.day4;

@SuppressWarnings("serial")
public class OldageUserException extends Exception {
	public OldageUserException(int age) {
		if(age<70) {
			System.out.println("Age must be less than 70 years");
		}
	}
}
