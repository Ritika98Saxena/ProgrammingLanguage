package com.java.programming;

import java.time.LocalDate;
import java.time.Month;

public class Happy_Birthday {
	 public static void main(String[] args)
	 {
		 int birthDate= 22;
		    Month birthMonth = Month.NOVEMBER;

		    LocalDate currentDate = LocalDate.now();
		    System.out.println("Todays Date: " + currentDate);

		    // get current date and month
		    int date = currentDate.getDayOfMonth();
		    Month month = currentDate.getMonth();

		    if(date == birthDate && month == birthMonth) {
		      System.out.println("HAPPY BIRTHDAY TO YOU !!");
		    }
		    else {
		      System.out.println("Today is not my birthday.");
		    }
		   }
	 }
	 
