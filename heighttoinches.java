package com.jayanth.sample;
import java.util.*;
public class heighttoinches {
			 	public static double height(double a,double b) {
			 		double total =a*b;
		 		return total;
			 		
			 	}
			 	 public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        double feet=sc.nextInt();
		        double i=2.54;
		        double res=height(feet,i);
		        System.out.println(res);
		 }
	}
