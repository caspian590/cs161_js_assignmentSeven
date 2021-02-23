package edu.cgcc.cs161;

import java.util.Scanner;

public class Scheduler {

	private String availServices;
	
	Survey obj = new Survey();
	ServiceNeed obj1 = new ServiceNeed();
	Appointment obj2 = new Appointment();
	Referral obj3 = new Referral();

	
	public static void Scanner() {
		
		   Scanner sc = new Scanner(System.in);
			
	       
		    System.out.print("Do you need an in person appointment? " );
		    String answer = sc.nextLine();
		    System.out.println();
	   

		     while (!answer.matches("no")) {
		    	System.out.println ("Please schedule an appointment in the calendar section.");
		    	
		     while (!answer.matches("No")) {
			   	System.out.println ("Please schedule an appointment in the calendar section.");
		    	
		     while (!answer.matches("yes")) {
				System.out.println ("You can continue to use our other services.");
				   
			 while (!answer.matches("Yes")) {
				System.out.println ("You can continue to use our other services.");
		    }
	
	        
}}}}}
