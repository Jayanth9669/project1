package com.jayanth.sample;
import java.util.*;
import java.util.stream.Collectors;

class StringGrouper {
    public static Map<String, List<String>> groupByVowelOrConsonant(List<String> words) {
        return words.stream().filter(word -> !word.isEmpty()).collect(Collectors.groupingBy(
            word -> "aeiou".indexOf(Character.toLowerCase(word.charAt(0))) != -1 ? "Vowel" : "Consonant"
        ));
    }
}

public class GroupStringsByVowelOrConsonant {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "umbrella", "cherry");
        System.out.println(StringGrouper.groupByVowelOrConsonant(words));
    }
}
