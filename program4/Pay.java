package program4;

import java.util.Scanner;

public class Pay {
	
	int idNumber;
	double payRate;
	double totalHours;
	double regHours;
	double regPay;
	double overTime;
	double overTimePay;
	double grossPay;
	double deductions;
	double netPay;
	double parking_charge = 20.00;
	
	Scanner input = new Scanner(System.in);
	
	
	
	public void employMetric()
	{
		System.out.println("Enter employee ID: ");
		idNumber = input.nextInt();
		
		System.out.println("Enter the employee's hourly rate: ");
		payRate = input.nextDouble();
		
		System.out.println("Enter number of hours worked: ");
		totalHours = input.nextDouble();
		
		if(totalHours > 40.0) 
		{
			overTime = totalHours - 40.0;
			regHours = totalHours - overTime;
			overTimePay = overTime * (payRate * 1.5);
			regPay = regHours * payRate;
			grossPay = overTimePay + regPay;
		}
		else
		{
			regHours = totalHours - overTime;
			regPay = regHours * payRate;
			grossPay = overTimePay + regPay;
		}
		
		if(grossPay > 500.00)
		{
			netPay = grossPay - parking_charge - (grossPay * (15.0/100.0));
			deductions = grossPay - netPay;
		} 
		else 
		{
			netPay = grossPay - parking_charge;
			deductions = grossPay - netPay;
		}
		input.close();
	}	
	
	public void printOut()
	{
		System.out.printf("ID Number: %d%nPay Rate: $%.2f%nRegular Hours: %.2f%nOvertime Hours: %.2f%nTotal Hours: %.2f%nRegular Pay: $%.2f%nOvertime Pay: $%.2f%n"
				+ "Gross Pay: $%.2f%nDeductions: $%.2f%nNet Pay: $%.2f", idNumber, payRate, regHours, overTime, totalHours, regPay, overTimePay, grossPay, deductions, netPay);
	}
	
	
	
	public static void main(String[] args)
	{
		Pay test = new Pay();
		test.employMetric();
		test.printOut();
		
	}
}
