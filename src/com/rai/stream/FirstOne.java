package com.rai.stream;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();

		// split the sentence into words
		String[] words = sentence.split("\\s+");

		// check if each word is a palindrome using streams
		Arrays.stream(words).forEach(word -> {
			if (isPalindrome(word)) {
				System.out.println(word + " is a plindorme.");
			} else {
				System.out.println(word + " is not a plindrome.");
			}
		});
	}

		//method to check if a word is a palindrome
	private static boolean isPalindrome(String word) {
		String reversed = new StringBuilder(word).reverse().toString();
		return word.equalsIgnoreCase(reversed);
	}

}
