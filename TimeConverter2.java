package com.jayanth.sample;
import java.util.*;
public class TimeConverter2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int minutes = sc.nextInt();
	        int seconds = sc.nextInt();
	        if (minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
	            System.out.println("Invalid input");
	           
	        }
	        int totalSeconds = minutes * 60 + seconds;
	        System.out.println(totalSeconds / 3600 + "h " + (totalSeconds % 3600) / 60 + "m " + totalSeconds % 60 + "s");
	        sc.close();
	 }
}
