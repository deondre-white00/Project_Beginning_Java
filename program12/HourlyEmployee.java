//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Twelve
//
//  File Name:            HourlyEmployee.java
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             5/09/2018
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              9
//
//  Description:
//     this class inherits from class employee. This program take user input
//		name, pay rate and hours worked(per week 4 week span) and calculate
//		regular hours worked, overtime hours and payrate out for both set of hours
//		along with taxes.
//
//********************************************************************
package Program12;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	

	private double monthlyHours;
	private double regular;
	private double overtime;
	public  double monthlyGrossPay;
	public  double monthRegularPay;
	public  double monthOvertimePay;
	private double monthlyTax;
	private double monthlyNetPay;
	private double monthlyRegularHours;
	private double monthlyOvertimehours;
	Scanner input = new Scanner(System.in);

	public HourlyEmployee() 
	{
		super();
	}

	public void setMonthlyHours(double monthlyHours) 
	{
		this.monthlyHours = monthlyHours;
	}
	
	
	
	public double getMonthlyRegularHours() 
	{
		return monthlyRegularHours;
	}
	
	public double getMonthlyOvertimeHours() 
	{
		return monthlyOvertimehours;
	}
	
	public double getMonthRegularPay() 
	{
		return monthRegularPay = (monthlyRegularHours * getPayRate());
	}
	
	public double getMonthOvertimePay() 
	{
		return monthOvertimePay = monthlyOvertimehours * (getPayRate() * 1.5 );
	}
	
	public void calHoursWorked()
	{
		monthlyRegularHours = 0.0;
		monthlyOvertimehours = 0.0;
		for(int i = 0; i < 4; ++i)
		{
			System.out.println("Enter hours worked: ");
			monthlyHours = input.nextDouble();
			if(monthlyHours > 40)
			{
				overtime = monthlyHours - 40;
				regular = monthlyHours - overtime;
				monthlyRegularHours = monthlyRegularHours + regular;
				monthlyOvertimehours = monthlyOvertimehours + overtime;
			}
			else if (monthlyHours <= 40)
			{
				regular = monthlyHours;
				monthlyRegularHours = monthlyRegularHours + regular;
			}
			
			
			System.out.println("Regular Hours: " + monthlyRegularHours);
			System.out.println("Overtime Hours: " + monthlyOvertimehours);
			
		}
		setTotalHours(monthlyOvertimehours + monthlyRegularHours);
	}
	
	public void calMonGrossPay()
	{
		monthlyGrossPay = getMonthOvertimePay() + getMonthRegularPay();
	}
	
	public void calNetPay()
	{
		if(monthlyGrossPay > 10000.00)
		{
			monthlyNetPay = monthlyGrossPay - (monthlyGrossPay * .36);
		}
		else if(monthlyGrossPay > 6000.00)
		{
			monthlyNetPay = monthlyGrossPay - (monthlyGrossPay * .31);
		}
		else if(monthlyGrossPay > 3500.00)
		{
			monthlyNetPay = monthlyGrossPay - (monthlyGrossPay * .28);
		}
		else if(monthlyGrossPay > 2000.00)
		{
			monthlyNetPay = monthlyGrossPay - (monthlyGrossPay * .15);
		}
		else if(monthlyGrossPay > 0.00)
		{
			monthlyNetPay = monthlyGrossPay - (monthlyGrossPay * .10);
		}
	}
	
	public void calTax()
	{
		monthlyTax = monthlyGrossPay - monthlyNetPay;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: "
				+ "%n%s: %.2f "
				+ "%n%s: %.2f "
				+ "%n%s: $%,.2f "
				+ "%n%s: $%,.2f "
				+ "%n%s: $%,.2f "
				+ "%n%s: $%,.2f "
				+ "%n%s: $%,.2f "
				, super.toString(),
				"Total regular hours worked", getMonthlyRegularHours(),
				"Total overtime hours worked", getMonthlyOvertimeHours(),
				"Monthly Regular Pay", getMonthRegularPay(),
				"Monthly overtime pay", getMonthOvertimePay(),
				"Monthly gross pay", monthlyGrossPay,
				"Monthly taxes", monthlyTax,
				"Monthly net pay", monthlyNetPay);
		
	}
	
	public void runApp()
	{
		System.out.println("Please enter first name: ");
		setFirstName(input.next());
		while(!"no".equals(getFirstName()))
		{
			
			System.out.println("Please enter last name: ");
			setLastName(input.next());
			System.out.println("Enter hourly rate: ");
			setPayRate(input.nextDouble());
			calHoursWorked();
			calMonGrossPay();
			calNetPay();
			calTax();
			System.out.println(toString());
			System.out.println("Please enter first name: ");
			setFirstName(input.next());
			
			
			
		}
	}
}
