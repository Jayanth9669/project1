package com.jayanth.sample;
import java.util.*;

public class student1 {
	    String name;
	    int rollNumber;  
	    public void Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }
	    public void displayDetails() {
	        System.out.println("STUDENT DETAILS:");
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	    }
	}
	public class StudentDatabase {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Map<String, Student> students = new HashMap<>();       
	        students.put("jayanth", new Student("Jayanth", 3));
	        students.put("ram", new Student("krishna", 4));
	        while (true) {
	            System.out.print("Enter student name (or 'exit' to quit): ");
	            String name = scanner.nextLine().trim().toLowerCase();
	            if (name.equals("exit")) {
	                break;
	            } 
	            Student student = students.get(name);
	            if (student != null) {
	                student.displayDetails();
	            } else {
	                System.out.println("Student not found.");
	            }
	        }
	        scanner.close();
	    }
	}

}

