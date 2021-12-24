//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program7
//
//  File Name:            DeonDreWhite_program1
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             3/25/2018
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter 6
//
//  Description:
//     Write a program that will help an elementary school student learn multiplication.
//
//********************************************************************
package program7;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) 
	{
		Program7 now = new Program7();
		now.question();
		now.newQuestion();

	}
	
	
	SecureRandom randomNumber = new SecureRandom();
	Scanner input = new Scanner(System.in);
	
	int questionRight = 1;
	int product;
	int questionWrong = 1;
	String content;
	
	
	
	public void question()
	{
		int digitOne = randomNumber.nextInt(10);
		int digitTwo = randomNumber.nextInt(10);
		
		System.out.printf("How much is %d times %d: ", digitOne, digitTwo);
		product = input.nextInt();	
		if(digitOne * digitTwo == product)
		{
			correctAnswer();
			
		}
		
		if(digitOne * digitTwo != product)
		{
			
			while(questionWrong < 5)
			{
				incorrectAnswer();
				System.out.printf("How much is %d times %d: ", digitOne, digitTwo);
				product = input.nextInt();
				questionWrong++;
				if(digitOne * digitTwo == product)
				{
					correctAnswer();
					break;
				}
			}
			
		}
	}
	
	public void newQuestion()
	{
		
		while(questionRight < 5) 
		{
			int digitThree = randomNumber.nextInt(10);
			int digitFour = randomNumber.nextInt(10);
			System.out.printf("How much is %d times %d: ", digitThree, digitFour);
			product = input.nextInt();	
			
			if(digitThree * digitFour == product)
			{
				correctAnswer();
				questionRight++;
				continue;
				
				
			}
			else if (digitThree * digitFour != product)
			{
				
				while(questionWrong < 5)
				{
					incorrectAnswer();
					System.out.printf("How much is %d times %d: ", digitThree, digitFour);
					product = input.nextInt();
					if(digitThree * digitFour == product)
					{
						correctAnswer();
						questionWrong++;
						break;
						
					}
					
					if(questionWrong >= 5)
					{
						product = digitThree * digitFour;
						System.out.printf("The answer is %d", product);
					}
				}
				
			}
			
		}
		lastQuestion();
	}
	
	public void lastQuestion()
	{
		System.out.printf("Would you like to continue testing? ('Y' for YES or 'N' for No)");
		 content = input.next();
		
		switch(content.toUpperCase())
		{
			case "Y": lastProblem();
				break;
			case "N": System.out.println("Thank you for playing!!");
				break;
			default: System.out.println("You did not enter an appropriate response!!");
				lastQuestion();
				break;
		}
	}
	
	public void lastProblem()
	{
			int digitThree = randomNumber.nextInt(10);
			int digitFour = randomNumber.nextInt(10);
			System.out.printf("How much is %d times %d: ", digitThree, digitFour);
			product = input.nextInt();	
			if(digitThree * digitFour == product)
			{
				correctAnswer();
				lastQuestion();
			}
			else
			{
				product = digitThree * digitFour;
				System.out.printf("The answer is %d%n", product);
				lastQuestion();
			}
			
	}
	
	
	
	public void correctAnswer()
	{
		int randomResponse = 1 +randomNumber.nextInt(5);
		String correctResponse = null;
		
		switch(randomResponse)
		{
			case 1: correctResponse = "Exellent!";
				break;
			case 2: correctResponse = "Very Good!";
				break;
			case 3: correctResponse = "Nice work!";
				break;
			case 4: correctResponse = "Way to Go!";
				break;
			case 5: correctResponse = "Keep up the good work!";
				break;
			
		}
		
		System.out.println(correctResponse);
	}
	
	public void incorrectAnswer()
	{
		int randomResponse = 1 +randomNumber.nextInt(5);
		String incorrectResponse = null;
		
		switch(randomResponse)
		{
			case 1: incorrectResponse = "That is incorrect!";
				break;
			case 2: incorrectResponse = "No. Please try again!";
				break;
			case 3: incorrectResponse = "Wrong, Try once more!";
				break;
			case 4: incorrectResponse = "Don’t give up!";
				break;
			case 5: incorrectResponse = "No. Keep trying!";
				break;
			
		}
		
		System.out.println(incorrectResponse);
	}
	
	
	
	

}
