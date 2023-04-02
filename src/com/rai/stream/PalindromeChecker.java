package com.rai.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();

		// split the sentence into words
		String[] words = sentence.split("\\s+");

		// check if each word is a palindrome using streams
		List<String> results = Arrays.stream(words).map(word -> {
			if (isPalindrome(word)) {
				return word + " is a palindrome.";
			} else {
				return word + " is not a palindrome.";
			}
		}).collect(Collectors.toList());

		// print the results to the console
		results.forEach(System.out::println);
	}

	// method to check if a word is a palindrome
	public static boolean isPalindrome(String word) {
		String reversed = new StringBuilder(word).reverse().toString();
		return word.equalsIgnoreCase(reversed);
	}

}
