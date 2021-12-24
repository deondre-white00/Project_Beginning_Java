//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program9
//
//  File Name:            DeonDreWhite_program1
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Due Date:             4/16/2018
//
//  Instructor:           Fred Kumi 
//
//  8Chapter:              Chapter 9
//
//  Description:
//	Create a class called SavingsAccount. The class should have a static variable named,
//	annualInterestRate, to store the annual interest rate for all account holders. Each object of
//	the class should contain a private instance variable named, savingsBalance, indicating the
//	amount the saver currently has on deposit. 
//
//********************************************************************
package program9;




public class SavingAccount 
{
	
	private static double annualInterestRate;
	private double beginBalance;
	public double endBalance;
	private double monthlyInterest;
	public double deposit;
	public double withdrawal;
	public static double modifyRate;
	
	
	
	public SavingAccount(double beginBalance, double annualInterestRate)
	{
		this.beginBalance = beginBalance;
		SavingAccount.annualInterestRate = annualInterestRate;
		
		
	}
	
	public static double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) 
	{
		SavingAccount.annualInterestRate = annualInterestRate/100;
	}
	
	public double getSavingsBalance() 
	{
		return beginBalance;
	}
	public void setSavingsBalance(double beginBalance) 
	{
		this.beginBalance = beginBalance;
	}
	
	public double calculateMonthlyInterest()
	{
		monthlyInterest = (beginBalance * (annualInterestRate/100))/ 12;
		endBalance = beginBalance  * Math.pow(1 + annualInterestRate/100, 1);
		
		for(int month = 1; month <= 12; month++)
		{
			double monthRate = beginBalance + monthlyInterest * month; 
			System.out.printf("Month %02d Balance: $%,7.2f%n", month, monthRate);
		}
		
		return monthlyInterest;
	}
	
	public double updateMonthlyInterest()
	{
		double updatedRate = (endBalance * (SavingAccount.modifyRate/100))/ 12;
		return endBalance = updatedRate + endBalance;
		
	}

	public double getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}

	public double withdrawAmount(double withdrawal)
	{	
		if(withdrawal > beginBalance)
			throw new IllegalArgumentException("Withdrawal greater than Balance");
		
		this.withdrawal = withdrawal;
		endBalance = endBalance - withdrawal;
		return endBalance;
	}
	
	public double depositAmount(double deposit)
	{
		if(deposit < 0.0)
			throw new IllegalArgumentException("Entered negative number");
		
		
		this.deposit = deposit;
		endBalance = deposit + endBalance;
		return endBalance;
	}
	
	public static void modifyInterestRate(double modifyRate)
	{
		if(modifyRate < 2 || modifyRate > 5)
			throw new IllegalArgumentException("The Rate is out of Range!");
		
		SavingAccount.modifyRate = modifyRate;
			
	}
	
	public String toString()
	{
		return String.format("Annual Rate: %.2f%nBegin Balance: $%,.2f%nEnding Balance:"
				+ "$%,.2f%nMonthly Interest: %.2f", annualInterestRate, beginBalance, endBalance, monthlyInterest);
	}
	
	
}
