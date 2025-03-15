package com.jayanth.sample;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    String rollNo;
    String subjects;
    double percentage;

    public Student(String rollNo, String subjects, double percentage) {
        this.rollNo = rollNo;
        this.subjects = subjects;
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subjects: " + subjects);
        System.out.println("Percentage: " + percentage + "%");
    }
}

//public class StudentInfoLookup {
//    public static void main(String[] args) {
//        Map<String, Student> studentMap = new HashMap<>();
//
//        // Adding students to the HashMap
//        studentMap.put("Alice", new Student("101", "Math, Science, English", 85.5));
//        studentMap.put("Bob", new Student("102", "History, Geography, English", 78.0));
//        studentMap.put("Charlie", new Student("103", "Physics, Chemistry, Math", 92.3));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter student name: ");
//        String name = scanner.nextLine();
//
//        if (studentMap.containsKey(name)) {
//            studentMap.get(name).displayInfo();
//        } else {
//            System.out.println("Student not found!");
//        }
//        
//        scanner.close();
//    }
//}
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class Student {
//    String rollNo;
//    String subjects;
//    double percentage;
//
//    public Student(String rollNo, String subjects, double percentage) {
//        this.rollNo = rollNo;
//        this.subjects = subjects;
//        this.percentage = percentage;
//    }
//
//    public void displayInfo() {
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Subjects: " + subjects);
//        System.out.println("Percentage: " + percentage + "%");
//    }
//}
//
//public class StudentInfoLookup {
//    public static void main(String[] args) {
//        Map<String, Student> studentMap = new HashMap<>();
//        try {
//            // Read JSON file as a string
//            String content = new String(Files.readAllBytes(Paths.get("students.json")));
//
//            // Parse JSON object
//            JSONObject jsonObject = new JSONObject(content);
//            JSONArray studentsArray = jsonObject.getJSONArray("students");
//
//            // Populate student map
//            for (int i = 0; i < studentsArray.length(); i++) {
//                JSONObject studentObject = studentsArray.getJSONObject(i);
//                String name = studentObject.getString("name");
//                String rollNo = studentObject.getString("rollNo");
//                String subjects = studentObject.getString("subjects");
//                double percentage = studentObject.getDouble("percentage");
//
//                studentMap.put(name, new Student(rollNo, subjects, percentage));
//            }
//
//            // Get student information based on user input
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter student name: ");
//            String name = scanner.nextLine();
//
//            // Check if the student exists in the map and display information
//            if (studentMap.containsKey(name)) {
//                studentMap.get(name).displayInfo();
//            } else {
//                System.out.println("Student not found!");
//            }
//
//            // Close the scanner
//            scanner.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
package com;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String[] subjects;
    double percentage;

    public Student(String name, int rollNo, String[] subjects, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
        this.percentage = percentage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println("\nPercentage: " + percentage + "%");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 101, new String[]{"Maths", "Science", "English"}, 85.5));
        students.add(new Student("Emma", 102, new String[]{"Physics", "Chemistry", "Biology"}, 90.2));
        students.add(new Student("Alex", 103, new String[]{"History", "Geography", "Civics"}, 78.8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                student.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }

        scanner.close();
    }
}
