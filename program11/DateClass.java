//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program11
//
//  File Name:            DeonDreWhite_program10
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             5/1/2018
//
//  Instructor:           Fred Kumi 
//
//  8Chapter:              Chapter 14
//
//  Description:
//	Date converter, convert MM/DD/YYYY to Month DD, YYYY and print out new format
//	
//
//********************************************************************
package program11;


import java.math.BigDecimal;
import java.util.Scanner;

public class DateClass {
	
	public String day;
	public String month;
	public String year;
	public String date;
	public String monthString;
	BigDecimal valueMonth;
	BigDecimal valueDay;
	Scanner input = new Scanner(System.in);
	
	public void receiveDate()
	{
		System.out.println("Enter Date:");
		date = input.next();
	}
	
	public void dateBreakdown()
	{
		String[] dateString = date.split("/");
		month = dateString[0];
		day = dateString[1];
		year = dateString[2];
	}	
	
	public boolean valMonth(String month)
	{	
		return month.matches("[01-12]");
	}
	
	public boolean valDay(String day)
	{		
		return day.matches("[1-31]");
	}
	
	public boolean valYear(String year)
	{		
		return year.matches("\\d{4}");
	}
	
	public void validateDate()
	{		
		valueMonth = new BigDecimal(month);
		valueDay = new BigDecimal(day);
		if(valueMonth.intValue() < 1 || valueMonth.intValue() > 12)
		{
			System.out.println("Month range must be within 1-12");
			confirm();
		}
		
		else if(valueDay.intValue() < 1 || valueDay.intValue() > 31)
		{
			System.out.println("Day must be with in 1-31");
			confirm();
		}
		
		else if(!valYear(year))
		{
			System.out.println("Year must be 4 digits");
			confirm();
		}
		
		else
		{
			convertMonth();
		}
		
		
		
		
	}
	
	public void convertMonth()
	{
		
		switch(month)
		{
		
		case "01": System.out.printf("%s %s, %s%n", month.replace("01", "January"), day, year);
			break;
		case "02": System.out.printf("%s %s, %s%n", month.replace("02", "February"), day, year);
			break;
		case "03": System.out.printf("%s %s, %s%n", month.replace("03", "March"), day, year);
			break;
		case "04": System.out.printf("%s %s, %s%n", month.replace("04", "April"), day, year);
			break;
		case "05": System.out.printf("%s %s, %s%n", month.replace("05", "May"), day, year);
			break;
		case "06": System.out.printf("%s %s, %s%n", month.replace("06", "June"), day, year);
			break;
		case "07": System.out.printf("%s %s, %s%n", month.replace("07", "July"), day, year);
			break;
		case "08": System.out.printf("%s %s, %s%n", month.replace("08", "August"), day, year); 
			break;
		case "09": System.out.printf("%s %s, %s%n", month.replace("09", "September"), day, year);
			break;
		case "10": System.out.printf("%s %s, %s%n", month.replace("10", "October"), day, year); 
			break;
		case "11": System.out.printf("%s %s, %s%n", month.replace("11", "November"), day, year);
			break;
		case "12": System.out.printf("%s %s, %s%n", month.replace("12", "December"), day, year);
			break;
		default: System.err.println("Month must be with in 1-12");
		}
		 confirm();
	}
	
	public void continuation()
	{
		receiveDate();
		dateBreakdown();
		valMonth(month);
		valDay(day);
		valYear(year);
		validateDate();
		
	}
	
	public void confirm()
	{
		System.out.println("\nDo you have another date you'd like to enter?(Enter \"Yes\" or \"No\")");
		String answer = input.next();
		
		if(answer.equalsIgnoreCase("yes"))
			continuation();
		else
		System.exit(0);
	}
	
	
	
	
		

	public static void main(String[] args) 
	{
		
		DateClass dates = new DateClass();
			dates.receiveDate();		
			dates.dateBreakdown();
			dates.valMonth(dates.month);
			dates.valDay(dates.day);
			dates.valYear(dates.year);
			dates.validateDate();
			
			
			
		
		

	}

}
