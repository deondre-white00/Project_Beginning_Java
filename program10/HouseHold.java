//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program10
//
//  File Name:            DeonDreWhite_program10
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             4/23/2018
//
//  Instructor:           Fred Kumi 
//
//  8Chapter:              Chapter 9
//
//  Description:
//	Print out info from Program 10 input. Calculate and printer average house hold income
//	
//
//********************************************************************
package program10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HouseHold 
{
	private Scanner input;
	private Formatter output;
	public int ID;
	public double annualIncome;
	public int houseMembers;
	public double averIncome;
	public double povertyLevel;
	public double entireList;
	ArrayList<Integer> houseID = new ArrayList<Integer>();
	ArrayList<Double> yearlyIncome = new ArrayList<Double>();
	ArrayList<Integer> houseCount = new ArrayList<Integer>();
	
	
	public void openFile()
	   {
	      try
	      {
	         input = new Scanner(Paths.get("Program10.txt")); 
	      } 
	      catch (IOException ioException)
	      {
	    	  output.format("Error opening file. Terminating.");
	         System.exit(1);
	      }
	   }
	
	public void readRecords()
	   {
	      try 
	      {
	    	  System.out.printf("%3s %9s %7s%n", "ID", "Income", "Count");
	    	 int index = 0;
	         while (input.hasNext()) // while there is more to read
	         {
	            // display record contents
	        	
	        	houseID.add(input.nextInt());
	        	yearlyIncome.add(input.nextDouble());
	        	houseCount.add(input.nextInt());
	        	System.out.printf("%4d %,10.2f %2d%n", houseID.get(index), yearlyIncome.get(index), houseCount.get(index));
	        	index++;
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
	
	public void createFile()
	   {
		   try
		      {
		         output = new Formatter("Program10-out.txt"); 
		         
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
	
	public void calculIncome()
	{
		for(int i = 0; i < yearlyIncome.size(); i++)
		{
			annualIncome = annualIncome + yearlyIncome.get(i);
		}
		averIncome = annualIncome/yearlyIncome.size();
		output.format("%s: $%,.2f","Average Household Income", averIncome);
		output.format("%n");
	}
	
	public void aboveAver()
	{
		output.format("%nHousehold with Incomes above Average Rate%n");
		for(int i = 0; i < yearlyIncome.size(); i++)
		{
			if(yearlyIncome.get(i) > averIncome)
			{
				output.format(" %d %.2f%n", houseID.get(i), yearlyIncome.get(i));
			}
		}
		output.format("%n");
	}
	
	public void povertyLevel()
	{
		int count = 0;
		output.format("Household under Poverty Level%n");
		for(int i = 0; i < yearlyIncome.size(); i++)
		{	
			povertyLevel = 16460.00 + 4320.00 * (houseCount.get(i) - 2);
			if(yearlyIncome.get(i) < povertyLevel)
			{
				output.format(" %d %.2f%n", houseID.get(i), yearlyIncome.get(i));
				count++;
			}
		}
		output.format("%n");
		for(int i = 0; i < yearlyIncome.size(); i++)
			entireList++;
		double percentage = 100 * (count/entireList);
		output.format("The percent of household that have income below the"
				+ "poverty level is %.2f%%", percentage);
	}	
	
	public void closeFile()
	   {
		   if(output != null)
			   output.close();
	   }
	
		
	

	
}
