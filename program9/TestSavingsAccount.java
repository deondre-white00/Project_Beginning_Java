package program9;



public class TestSavingsAccount {
	

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000.00, 4);
		saver1.calculateMonthlyInterest();
		System.out.println(saver1);
		saver1.depositAmount(1500);
		System.out.printf("Deposit Amount: $%,.02f%nNew Balance: $%,.02f%n",saver1.deposit, saver1.endBalance);
		SavingAccount.modifyInterestRate(5);
		System.out.printf("Updated Rate %.2f%nOne Month Balance: $%,.02f%n%n", SavingAccount.modifyRate, saver1.updateMonthlyInterest());
		
		
		
		SavingAccount saver2 = new SavingAccount(3000.00, 4);
		saver2.calculateMonthlyInterest();
		System.out.println(saver2);
		saver2.withdrawAmount(500);
		System.out.println(saver2.endBalance);
		System.out.printf("Withdraw Amount: $%,.02f%nNew Balance: $%,.02f%n",saver2.withdrawal, saver2.endBalance);
		SavingAccount.modifyInterestRate(5);
		System.out.printf("Updated Rate %.2f%nOne Month Balance: $%,.02f%n%n", SavingAccount.modifyRate, saver2.updateMonthlyInterest());
		
		
		
		

		
	}
	
	
	

}
