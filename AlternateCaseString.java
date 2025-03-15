package com.jayanth.sample;
import java.util.Scanner;

public class AlternateCaseString {
	    public static String alternateCase(String input) {
	        StringBuilder result = new StringBuilder();
	        boolean toUpper = true;

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) { 
	                result.append(toUpper ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
	                toUpper = !toUpper;
	            } else {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String output = alternateCase(input);
	        System.out.println("Transformed String: " + output);
	    }
	}
