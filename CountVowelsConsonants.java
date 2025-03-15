package com.jayanth.sample;
import java.util.*;
public class CountVowelsConsonants {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String str = sc.next().toLowerCase();
	        int vowels = 0, consonants = 0;
	        for (char ch : str.toCharArray()) {
	            if ("aeiou".indexOf(ch) >= 0) vowels++;
	            else if (Character.isLetter(ch)) consonants++;
	        }
	        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	}

}
