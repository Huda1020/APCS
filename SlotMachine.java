//Huda Abdulle
package arraymethods;
import java.util.Scanner;
public class SlotMachine {
	static int balance = 0;
	static int numspins = 0;
	
	
	public static void Slot()
	{
		int slot1 = (int)(Math.random()*10);
	 int slot2= (int)(Math.random()*10);
		int slot3= (int)(Math.random()*10);
	
	if (slot1 == slot2 && slot2 == slot3)
	{
		balance += 1000;
		System.out.println("You won 1000");
	}
	
	else if (slot1 == slot2 || slot1 == slot3 || slot2==slot3)
	{
		balance += 25;
		System.out.println("You won $25");
	}
	 else
	{
		balance -= 15;
		System.out.println("You lost $15");
	}
	
	numspins +=1;
	System.out.println("Balance: $" + balance + " "+"Number of Spins:" + numspins);
	}
	public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  int name;

		do {
			
		Slot();
		System.out.println("enter 1 if you want to go again, otherwise enter 0 to exit");
        name = keyboard.nextInt();
		}
		while (name == 1);
		
	   

		
	}
	
	
	

}
