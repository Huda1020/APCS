package conditionals;

import java.util.Scanner;

public class TicketTester {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);	
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		 System.out.println("What grade are you in? Ex.Freshman,Sophomore,Junior,Senior");
		 String grade = keyboard.nextLine();	
		System.out.println("How many people are attending?");	     
		int num = keyboard.nextInt();	
		PromTickets ticket = new PromTickets(grade,name,num);
		String ticketType = "";
		if (num == 1)
		{
			ticketType = "solo";
		}
		else if (num ==2)
		{
			ticketType = "couple";
		}
		else if (num >=3)
		{
			ticketType = "group";
		}
		System.out.println(name + " purchased a " + grade + " " + ticketType + " ticket for "+ ticket.ticketCost() + " dollars.  "  +" Their confirmation code is" +  PasswordGenerator.generatePassword1());
		
	}
}
