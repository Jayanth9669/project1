package com.jayanth.sample;
import java.util.*;
import java.util.stream.Collectors;

class NumberGrouper {
    public static Map<String, List<Integer>> groupByDivisibility(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.groupingBy(
            num -> (num % 2 == 0) ? "Divisible by 2" : (num % 5 == 0) ? "Divisible by 5" : "Neither"
        ));
    }
}

public class num {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 23, 50, 7);
        System.out.println(NumberGrouper.groupByDivisibility(numbers));
    }
}
