package com.jayanth.sample;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		if(salary<10000 && salary>5000) {
			System.out.print(salary+(salary*0.05));
		}
		else if(salary<5000 && salary>0) {
			System.out.print(salary+(salary*0.06));
		}
		else {
			System.out.print("No Increment");
		}
	} 
}
