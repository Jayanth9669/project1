package com.jayanth.sample;
import java.util.*;
public class DivisibleNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        int count = 0, sum = 0;
	        for (int i = 1; i <= 1000; i++) {
	            if (i % num1 == 0 && i % num2 == 0) {
	                System.out.println(i);
	                sum += i;
	                if (++count == 5) break;
	            }
	        }
	        System.out.println("Sum: " + sum);
	    }
}
