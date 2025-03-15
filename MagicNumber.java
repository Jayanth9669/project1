package com.jayanth.sample;
import java.util.*;
class MagicNumber {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        System.out.println("Magic Number: " + num);
    }
}