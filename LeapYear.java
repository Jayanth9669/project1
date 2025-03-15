package com.jayanth.sample;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year");
        } else {
            System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "Leap Year" : "Not a Leap Year");
        }
        sc.close();
    }
}
