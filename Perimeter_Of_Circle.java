package com.java.programming;
import java.util.Scanner;
public class Perimeter_Of_Circle {
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter radius");
	double radius = s.nextDouble();
	System.out.println("Area of Circle =" +(Math.PI * radius * radius));
	System.out.println("Perimeter of Circle =" +(2 * Math.PI * radius));
	
	}

}
