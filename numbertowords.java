package com.jayanth.sample;
import java.util.*;
public class numbertowords {
	
	    static String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String num = sc.next();
	        for (char ch : num.toCharArray()) {
	            System.out.print(words[ch - '0'] + " ");
	        }
	        sc.close();
	    }
	}
