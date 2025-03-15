package com.jayanth.sample;
import java.util.*;
public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> seen = new HashSet<>(), duplicates = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) duplicates.add(ch);
        }
        System.out.println("Duplicates: " + duplicates);

	}

}
