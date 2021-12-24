//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program1
//
//  File Name:            DeonDreWhite_program1
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             1/30/2016
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter 2
//
//  Description:
//     The program will display two check amounts, one with bi weekly payment amount and the other with receiving two paychecks a month.
//
//********************************************************************
package program1;

public class Program1 {

	public static void main(String[] args) {
		double annually = 32500.00, biweekly, dualMonth;
		int bi = 26;
		int twice = 24; 
		
		biweekly = annually/bi;
		
		dualMonth= annually/twice; 
		
		System.out.printf("If you are paid bi-weekly, your check will be: %.2f",biweekly);
		
		System.out.println();
		
		System.out.printf("If you are paid twice a month, your check will be: %.2f",dualMonth);
		
		
		

	}

}
