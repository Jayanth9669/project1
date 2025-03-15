package com.jayanth.sample;

public class Attendence {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88};
        Student student1 = new Student("John Doe", 101, "9876543210", studentMarks);
        
        System.out.println("Student Details:");
        student1.displayStudentInfo();
    }
}
