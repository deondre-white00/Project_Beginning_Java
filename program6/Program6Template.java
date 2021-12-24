//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program6
//
//  File Name:            DeonDreWhite_program1
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             3/11/2018
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Chapter 15
//
//  Description:
//     The program will print pay raises for each faculty member, the total amount of the raises and the average of the raises. Also, print the total and average faculty payroll before and after the raise.
//
//********************************************************************
package program6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program6Template {

	private Scanner input;
	private Formatter output;
	double highSalary = 70000.00;
	double midSalary = 50000.00;
	int employee;
	double salary;
	double raise;
	double newSalary;
	double totalRaises;
	int count;
	double averRaise;
	double totalPayroll;
	double totalAverPay;
	double newPayroll;
	double newAverPay;
	
	

	   public static void main(String[] args)
	   {
		   Program6Template myObject = new Program6Template();
		   
	       myObject.openFile();
	       myObject.readRecords();
	       myObject.createFile();
	       myObject.addRecords();
		  
	   } 


	   public void openFile()
	   {
	      try
	      {
	         input = new Scanner(Paths.get("Program6.txt")); 
	      } 
	      catch (IOException ioException)
	      {
	         System.err.println("Error opening file. Terminating.");
	         System.exit(1);
	      }
	   }
	   
	   
	   // Read records from the file
	   public void readRecords()
	   {
	      try 
	      {
	         while (input.hasNext()) // while there is more to read
	         {
	            // display record contents
	        	
	            System.out.printf("%,10.2f%n", input.nextDouble());
	         }
	      } 
	      catch (NoSuchElementException elementException)
	      {
	         System.err.println("File improperly formed. Terminating.");
	      } 
	      catch (IllegalStateException stateException)
	      {
	         System.err.println("Error reading from file. Terminating.");
	      } 
	   }
	   
	   //Creates new file
	   public void createFile()
	   {
		   try
		      {
		         output = new Formatter("Program6-out.txt"); 
		      } 
		      catch (SecurityException securityException)
		      {
		         System.err.println("Write permission denied. Terminating");
		         System.exit(1);
		      }
		   	  catch (FileNotFoundException fileNotFoundException) 
		   	  {
		   		  System.err.println("Error opening file. Terminating.");
		   		  System.exit(1);
		   	  }
		   
		   
	   }
	   
	   public void addRecords()
	   {
		   Scanner input = new Scanner(System.in);
		   System.out.printf("%s%n%s%n","Enter Salary", "Enter end-of-file indicator to end input(Ctrl + Z):");
		   
		   while(input.hasNext())
		   {
			   try 
			   {
				   salary = input.nextDouble();
				   if(salary > highSalary)
				   {
					    raise = salary * .04;
				   }
				   else if (salary > midSalary)
				   {
					    raise = salary * .07;
				   }
				   else
				   {
					    raise = salary * .055;
				   }
				   
				   calculate();
				   
			   }
			   catch(NoSuchElementException elementException)
			   {
				   System.err.println("Invalid input. Please try again");
				   input.nextLine();
			   }
			   catch(FormatterClosedException formatterClosedException)
			   {
				   System.err.println("Error writing to file. Termminating. ");
				   input.nextLine();
			   }
			   
		   }
			   
			   
			   
		   
		   
	   }
	   
	   public void calculate()
	   {
		   
		   System.out.printf("%s: %,.2f%n", "Employee Raise", raise);
		   totalRaises += raise;
		   System.out.printf("%s: %,.2f%n","Company Raise", totalRaises);
		   count++;
		   averRaise = totalRaises/count;
		   System.out.printf("%s: %,.2f%n","Average Raise", averRaise);
		   totalPayroll += salary;
		   System.out.printf("%s: %,.2f%n","Total Payroll", totalPayroll);
		   totalAverPay = totalPayroll/count;
		   System.out.printf("%s: %,.2f%n","Total Average Pay", totalAverPay);
		   newPayroll = totalPayroll + totalRaises;
		   System.out.printf("%s: %,.2f%n","New Payroll", newPayroll);
		   newAverPay = newPayroll/count;
		   System.out.printf("%s: %,.2f%n","New Average Payroll", newAverPay);		   
	   }
	 
	}


