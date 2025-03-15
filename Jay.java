package com.jayanth.sample;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Jay {
	public static void main(String args[]) {
		List<String> rev=new ArrayList<>();
		rev.add("jayanth");
		rev.add("vishnu");
		rev.add("hii)");
//		System.out.println(rev);
		rev.stream().forEach(nums->System.out.println(nums.length()));
		
		List<String>fil=rev.stream().filter(name->name.length()>4).collect(Collectors.toList());
		fil.forEach(System.out::println);
//		Stream<String>fil=rev.stream();
//		collect<String> fil.stream().sorted().collect(Collectors.toList());
////		rev.forEach(System.out::println);
//		System.out.println(fil);
//		
	}
}
