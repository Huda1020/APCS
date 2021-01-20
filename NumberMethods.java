//Huda Abdulle Period #2
package loops;

public class NumberMethods {

	
public static boolean isPrime(int num) 
{
boolean prime = false;

int Counter= 0;
for(int i=2;i<num;i++) 
{
    if(num%i==0)
    {
    	Counter++;
    }

}
     if(Counter> 0)
     {
    	 prime = false;
     }
    	 else if (Counter==0)
    		 
    	 {
 
    		 prime = true;
    	 }
     return prime; 		
}


public static int divisorSum(int num) 
{
int sum = 0;
for (int i = 1; i < num; i++)
{
    if (num % i == 0)
    {
        sum = sum + i;
    }
}
return sum;
}

public static boolean isStrong(int num)
{
boolean strong = false;
 
if(isPrime(num) == false && num > divisorSum(num))
{
	strong = true;
}
return strong;
}


public static void printDivisors(int num) 
{
	 System.out.println("The divisors less than  " + num + " are : ");
	for (int i = 1; i < num; i++ ) 
	{

     if (num % i == 0)
     {
     
     System.out.println(i+",  ");
    
	}
     
	}
	
}
public static void printPrimes(int num)
{
	System.out.println("The prime numbers less than "+ num+ " are :");
	
	for (int i=2;i<=num;i++) 
	{
    if (isPrime(i))
    
	System.out.println(i+ ",");
}
		
	}

public static void printComposites(int num) 
{
	System.out.println("The composite numbers less than "+ num + "  are");
	for (int i=2;i<num;i++) 
	{
    if (!isPrime(i))
    
	System.out.println(i+ ",");
}
	
}
public static void printStrong(int num)
{
System.out.println("The strong numbers less than  "+ num+ " are :");
	
	for (int i=2;i<=num;i++) 
	{
    if (isStrong(i))
    
	System.out.println(i+ ",");
	}
}

public static void printWeak(int num) 
{
System.out.println("The weak numbers less than  "+ num+ " are :");
	
	for (int i=2;i<num;i++) 
	{
    if (!isStrong(i)&& !isPrime(i))
    
	System.out.println(i+ ",");
	}
	
//This method prints all the weak numbers less than n on a single line
//The call printWeak(30) should print 6 12 18 20 24 28
//This method MUST use the isStrong method
}


public static void main(String[] args) 
{
printComposites(30);
printPrimes(30);
printStrong(30);
printWeak(30);
printDivisors(30);

}
}








