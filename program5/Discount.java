package program5;

import java.util.Scanner;

public class Discount {
	
	int quantity;
	double totalcost;
	double percent;
	double savings;
	double cost;
	double price = 99;
	
	
	
	Scanner input = new Scanner(System.in);
	
	public void quantity() 
	{
		System.out.println("Enter quantity of packages requested: ");
		quantity = input.nextInt();
		
		if(quantity < 10)
		{
			discount(0);
		}
		
		else if (quantity < 40)
		{
			discount(10);
		}
		
		else if (quantity < 66)
		{
			discount(18);
		}
		
		else if(quantity < 91)
		{
			discount(27);
		}
		
		else if(quantity < 121)
		{
			discount(35);
		}
		
		else if(quantity < 200)
		{
			discount(42);
		}
		
		else
		{
			discount(48);
		}
		
		System.out.printf("Number of units purchased is: %d%n", quantity);
		
		System.out.printf("Discount applied is: %.0f%%%n", percent*100);
		
		cost = price + quantity;
		System.out.printf("Cost before discount is applied: $%.2f%n", cost);
		
		savings = cost * percent;
		System.out.printf("Total savings due to discount is: $%.2f%n", savings);
		
		totalcost = cost - savings;
		System.out.printf("The total cost of the purchase is: $%.2f%n", totalcost);
		
	}
	
	public void discount(int range) 
	{
		percent = range/100.0;
	}
	
	
	

	public static void main(String[] args) {
		Discount test = new Discount();
		test.quantity();
		
		

	}

}
