package conditionals;

public class PasswordGenerator 
{
	public static String generatePassword1() {
		String password = "";
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	//1st char
		int rand = (int)(Math.random()*characters.length());
				password+= characters.substring(rand,rand+1);
				
			//2nd char	
				 rand = (int)(Math.random()*characters.length()); 
				password+= characters.substring(rand,rand+1);
				//3rd
				rand = (int)(Math.random()*characters.length()); 
				password+= characters.substring(rand,rand+1);
				//4th
				rand = (int)(Math.random()*characters.length()); 
				password+= characters.substring(rand,rand+1);
				//5th
				rand = (int)(Math.random()*characters.length()); 
				password+= characters.substring(rand,rand+1);
				//6th
				rand = (int)(Math.random()*characters.length()); 
				password+= characters.substring(rand,rand+1);
				
				
		        return password;
	}
	
	public static String generatePassword2() {
		String password = "";
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int rand = (int)(Math.random()*characters.length());
				password+= characters.substring(rand,rand+1);
				
				 rand = (int)(Math.random()*characters.length()); ///does it again
				password+= characters.substring(rand,rand+1);///does it again for second character
				
				 rand = (int)(Math.random()*characters.length()); ///does it again
					password+= characters.substring(rand,rand+1);///does it again for second character
					
					 rand = (int)(Math.random()*characters.length()); ///does it again
						password+= characters.substring(rand,rand+1);///does it again for second character
						
						 rand = (int)(Math.random()*characters.length()); ///does it again
							password+= characters.substring(rand,rand+1);///does it again for second character
							
							 rand = (int)(Math.random()*characters.length()); ///does it again
								password+= characters.substring(rand,rand+1);///does it again for second character
				
				
				
		        return password;
	}
	public static void main(String[] args)
	{

		System.out.println(generatePassword1());
		System.out.println(generatePassword2());
	}
}
