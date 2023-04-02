package com.rai;

import java.util.Scanner;

public class FirstOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 5; i++) {
			System.out.println("Enter your percentage score: ");
			double percentage = input.nextDouble();

			char grade;

			if (percentage >= 90) {
				grade = 'A';
			} else if (percentage >= 80) {
				grade = 'B';
			} else if (percentage >= 70) {
				grade = 'C';
			} else if (percentage >= 60) {
				grade = 'D';
			} else if (percentage >= 50) {
				grade = 'E';
			} else {
				grade = 'F';
			}

			System.out.println("Your letter grade is: " + grade);
		}
	}
	//do not forget to add a comment in each method.

}
