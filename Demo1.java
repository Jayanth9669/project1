package com.jayanth.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student1 {
    private String name;
    private int roll;
    private String gender;

    public Student1(String name, int roll, String gender) {
        this.name = name;
        this.roll = roll;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student1{name='" + name + "', roll=" + roll + ", gender='" + gender + "'}";
    }
}

public class Demo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student1("Jayanth", 101, "Male"));
        students.add(new Student1("Vishnu", 102, "Male"));
        students.add(new Student1("Inane", 103, "Female"));
        students.add(new Student1("Jay", 104, "Male"));

        System.out.println("Student List: " + students);

        Map<String, List<Student1>> groupedByGender = students.stream()
                .collect(Collectors.groupingBy(Student1::getGender));
        System.out.println("Grouped by Gender: " + groupedByGender);

        List<Integer> numbers = Arrays.asList(0, -1, 1, 2, 3, 4, -5);
        Map<String, List<Integer>> numberGroups = numbers.stream()
                .collect(Collectors.groupingBy(n -> n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"));
        System.out.println("Number Groups: " + numberGroups);

        List<String> names = Arrays.asList("Jayanth", "Vishnu", "i", "inane", "Jay");
        Map<Character, List<String>> groupedByFirstChar = names.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println("Grouped by First Character: " + groupedByFirstChar);

        Map<Character, Long> countByFirstChar = names.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.counting()));
        System.out.println("Count by First Character: " + countByFirstChar);
    }
}