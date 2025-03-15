package com.jayanth.sample;


import java.util.Scanner;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        sc.close();

        Stream.of(salary).map(sal -> sal > 5000  sal < 10000 ? sal + (sal * 0.10) :
                        sal > 0 && sal < 5000 ? sal + (sal * 0.2) :
                        "No Increment")
            .forEach(System.out::println);
    }
}
