package com.jayanth.sample;
import java.util.*;
public class PalindromeNumber {
	 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
    int rev = 0;
     int temp = num;
     while (temp > 0) {
         rev = rev * 10 + temp % 10;
         temp /= 10;
     }
     System.out.println(num == rev ? "Palindrome" : "Not a Palindrome");
 }

}
