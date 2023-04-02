package com.rai;

import java.util.Scanner;

public class SecondOne {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Have you ever been convicted of a DUI or other serious "
				+ "driving offense? (Y/N): ");
		String convictions = input.next();
		
		System.out.println("Do you have correctable vision problems? (Y/N): ");
		String vision = input.next();
		
		if(age >= 16 && convictions.equalsIgnoreCase("N") && vision.equalsIgnoreCase("N")) {
			System.out.println("Congratualtions, you are eligible for a driver's license!");
		}else if (age < 16) {
			System.out.println("Sorry, you must be at least 16 years old to be eligible for a driver's license.");
		}else if (convictions.equalsIgnoreCase("Y")) {
			System.out.println("Sorry, you are not eligible for a driver's licence due to prior convictions.");
		}else if (vision.equalsIgnoreCase("Y")) {
			System.out.println("Sorry, you are not eligible for a dirver's liecense due to vision problems.");
		}else {
			System.out.println("Sorry, you are not eligible for a dirver's license due to other reasons.");
		}
	}

}
