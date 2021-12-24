//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program2
//
//  File Name:            DeonDreWhite_program2
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             2/4/2018
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter 2
//
//  Description:
//     Calculate the daily driving cost, while taking input from the user.
//
//********************************************************************

package program2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
		String name;
		double miles;
		double costPerGallon;
		double averMPG;
		double parking;
		double tolls;
		double operatorCost;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hello, please enter your name: ");
		name = input.nextLine();
	
		System.out.print("How many miles do you drive on a daily?");
		miles = input.nextDouble();
		
		System.out.print("What is the cost of gas per gallon?");
		costPerGallon = input.nextDouble();
		
		System.out.print("Please enter your average MPG:");
		averMPG = input.nextDouble();
		
		System.out.print("What do you pay in parking fees?");
		parking = input.nextDouble();
		
		System.out.print("What do you pay in tolls per day?");
		tolls = input.nextDouble();
		
		operatorCost = costPerGallon * miles / averMPG + parking + tolls;
		
		System.out.printf("%s, your daily driving cost is listed as $%.2f.", name, operatorCost);
		
		
	}
}
