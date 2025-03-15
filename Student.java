package com.jayanth.sample;

public class Student {
    String name;
    int rollNo;
    String phoneNumber;
    int[] marks;
    int totalMarks;
    double percentage;

    public Student(String name, int rollNo, String phoneNumber, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
        this.marks = marks;
        calculateTotalAndPercentage();
    }

    public Student(String name2, int rollNo2, String phoneNumber2, int[] studentMarks) {
		// TODO Auto-generated constructor stub
	}

	private void calculateTotalAndPercentage() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        percentage = (double) totalMarks / marks.length;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}