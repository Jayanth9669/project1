package com.jayanth.sample;
import java.util.*;
public class countsymbols {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int symbol=0;
		for(char ch:a.toCharArray()) {
			if(!Character.isLetterOrDigit(ch)) symbol++;
		}
		System.out.print(symbol);
	}
}
