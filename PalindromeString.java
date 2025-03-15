package com.jayanth.sample;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not a Palindrome");
    }
}
