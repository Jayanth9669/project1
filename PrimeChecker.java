package com.jayanth.sample;
import java.util.Scanner;
public class PrimeChecker {
	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num < 1 || num > 1000) {
        System.out.println("Invalid number");
        return;
    }
    int count = 0;
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) count++;
    }
    System.out.println("Factors: " + count + ", Prime: " + (count == 2));
	
	}

}
