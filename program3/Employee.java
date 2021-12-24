package program3;

public class Employee {
		
		private String first_name;
		private String last_name;
		private double monthly_salary;
		
		//constructor initializes the instance variables
		public Employee(String first_name, String last_name, double monthly_salary)
		{
			this.first_name = first_name;
			this.last_name = last_name;
			if(monthly_salary > 0.0)//conditional statement if monthly salary isn't positive
			{
				this.monthly_salary = monthly_salary;
			} 
			
		}
		
		//setter method to store first name
		public void setfirst(String first_name)
		{
			this.first_name = first_name;
		}
		
		//setter method to store last name
		public void setLast(String last_name)
		{
			this.last_name = last_name;
		}
		
		//setter method to store monthly salary
		public void setMonth(double monthly_salary)
		{
			this.monthly_salary = monthly_salary;
		}
		
		//getter method that returns the users first name to the caller
		public String getFirst() 
		{
			return first_name;
		}
		
		//getter method that returns the last first name to the caller
		public String getLast()
		{
			return last_name;
		}
		
		//getter method that returns the monthly salary to the caller
		public double getMonth()
		{
			return monthly_salary;
		}

}
