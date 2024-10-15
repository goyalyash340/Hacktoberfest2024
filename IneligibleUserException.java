package com.exceptionHandlingExample.day4;

@SuppressWarnings("serial")
public class IneligibleUserException extends Exception {
	public IneligibleUserException(int age) {
		
		if(age<20) {
			System.out.println("Age must be greater than 20.");
		}
	}
}
