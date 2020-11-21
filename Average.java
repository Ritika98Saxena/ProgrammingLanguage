package com.java.programming;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = s.nextInt();
		System.out.println("Enter second number:");
		int num2 = s.nextInt();
		System.out.println("Enter third number:");
		int num3 = s.nextInt();
		int average = (num1 +num2 + num3)/3;
		System.out.println("Average of three numbers is: "+average);
}
}