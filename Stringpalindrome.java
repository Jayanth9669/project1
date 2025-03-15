package com.jayanth.sample;

//
//public class Stringpalindrome {
//	public static void main(String[] args) {
//		int a=10;
//		int b=0;
//	
//			try {
//				
//				int c=a/b;
//				System.out.println(c);
//			}
//			catch(ArithmeticException  e){
//				System.err.println("can not print");
//			}
////			
//		String a=null;
//		try {
//			char b=a.charAt(0);
//		}
//		catch(NullPointerException e){
//			System.err.println("can not print");
//		}
		// Java program to demonstrate 
		// the getMessage() Method. 

		import java.io.*; 

		class Stringtopalindrome { 

			public static void main(String[] args) 
				throws Exception 
			{ 

				try { 
					divide(2, 0); 
				} 

				catch (ArithmeticException e) { 

					System.out.println("Message String = "
									+ e.getMessage()); 
				} 
			} 

			public static void divide(int a, int b) 
				throws ArithmeticException 
			{ 
				int c = a / b; 

				System.out.println("Result:" + c); 
			} 
		 

       }
