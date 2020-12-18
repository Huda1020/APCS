//import java.util.Scanner;
package conditionals;


 public class PromTickets
 {
	 
	 private String grade,name;
	 private int numberofpeople;
	 
	 
	public PromTickets(String s1, String s2,int i1 )
	{
		grade = s1;
		name = s2;
		numberofpeople = i1;
	
	}
	
	public int ticketCost()
	{
		int ticketCost= 0;
		if (grade.equalsIgnoreCase("Senior"))
		{
			if (numberofpeople == 1)
		{
			ticketCost = 40;	
		}
			if (numberofpeople == 2)
		{
				ticketCost = 60;
		}
			if (numberofpeople >=3)
			{
				ticketCost = 100;
			}
			
				
					}
		
		if (grade.equalsIgnoreCase("Junior"))
		{
			if (numberofpeople == 1)
			{
				ticketCost= 45;
			}
			if (numberofpeople ==2)
			{
				ticketCost = 68;
			}
			if (numberofpeople>=3)
			{
				ticketCost = 113;
			}
		}
			
		
		if (grade.equalsIgnoreCase("Sophomore"))
		{
			if (numberofpeople == 1)
			{
				ticketCost= 55;
			}
			if (numberofpeople ==2)
			{
				ticketCost = 83;
			}
			if (numberofpeople>=3)
			{
				ticketCost = 138;
			}
			
		}
			
		
		if (grade.equalsIgnoreCase("Freshman"))
		{
			if (numberofpeople == 1)
			{
				ticketCost= 65;
			}
			if (numberofpeople ==2)
			{
				ticketCost = 98;
			}
			if (numberofpeople>=3)
			{
				ticketCost = 163;
			}
		}
			return ticketCost;
		}
		
	}
 

