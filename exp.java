package com.jayanth.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class exp {
	public static void main(String args[]) {
		List<Integer>j=new ArrayList<>();
		j.add(1);
		j.add(2);
		j.add(3);
		j.add(4);
		j.add(5);
		j.add(6);
		j.stream().filter(ja->num%2==0);
		j.stream().forEach(ja -> System.out.println(j));
	}
}
