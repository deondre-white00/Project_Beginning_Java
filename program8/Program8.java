//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program8
//
//  File Name:            DeonDreWhite_program8
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             4/3/2018
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter 7
//
//  Description:
//     Write a program that will assign seats on a flight. The application will use arrays to store the data
//
//********************************************************************
package program8;

import java.util.Arrays;
import java.util.Scanner;

public class Program8 {
	
	Scanner input = new Scanner(System.in);	
	int firstClass = 1;
	int econClass = 1;
	String seatclass;
	boolean[] seating = new boolean[10];
	
	
	

	public static void main(String[] args) {
		Program8 program8 = new Program8();
		program8.greeting();
		
		
		
		
		
		
		
	}//end of main

	public void greeting()
	{
		
		
		while(seating[9] != true)
		{
			System.out.println("Welcome to Top Flight Airlines! \nPlease select your seat(select 1 for First class and 2 for Economy)!");
			int seat = input.nextInt();
			if(seat == 1)
			{
				seatCount(firstClass, "First Class");
				altSeating(firstClass, "First Class");
				firstClass++;
				
				
				
				
			}
			else if(seat == 2)
			{
				seatCount(econClass, "Economy");
				altSeating(econClass, "Economy");
				econClass++;
				
			}
				
			else
			{
				System.out.println("You did not have a valid entry, please try again!\n");
			}
			
			
			
			
		}//end of while
	}
	
	public int seatCount(int count, String seatclass)
	{ 
		int seatcount = 5;
		int seatsava = seatcount - count;
		System.out.printf("We only have %d seat left for %s for you selection%n%n", seatsava, seatclass);
		return count;
	}//end seatCount
	
	public void altSeating(int count, String seatclass)
	{
		if(count == 5)
		{
			System.out.printf("We are out of %s seats. Would you like to try another option?(Enter Y for YES or N for NO)%n", seatclass);
			String econflight = input.next().toUpperCase();
			if(econflight.equals("Y"))
			{
				if(econClass < 5)
				{
					seatCount(econClass, "Economy");
					econClass++;
				}
				else if(firstClass < 5)
				{
					seatCount(firstClass, "First Class");
					firstClass++;
				}
				else
				{
					System.out.printf("All seats are booked. Our next flight will be in 3 hours.");
					modifyFC(seating);
					System.exit(0);
					
				}
			}//end of if(econflight == 1)
			else
			{
				System.out.println("Our next flight is in three hours. Thank you!");
				modifyFC(seating);
				System.exit(0);
				
			}
			
		}//end of if(count == 5)
	}// end of altSeating
	
	public void modifyFC(boolean[] seating2)
	{
		for(int counter = 0; counter < seating2.length ; counter++)
		{
			seating2[counter] = !seating2[counter];	
			
		}
		System.out.println(Arrays.toString(seating2));
		
		
	}//end of modifyFC
	
	
	
	
	
}//end of program
