package com.jayanth.sample;

import java.util.*;
public class target {  

		        public static int add(int a,int b) {
		        	  int total =a+b;
		        	  return total;
		        }
	        public static void main(String[] args) {
			        Scanner sc=new Scanner(System.in);
			        int f=sc.nextInt();
			        int s=sc.nextInt();
			        int t=sc.nextInt();
		        int total =add(f,s);
			        if(total == t) {
			        	System.out.println("True");
			        }
			        else {
			        	System.out.println("False");
			        }
		        System.out.println(total);
		      
		        
		}
}        