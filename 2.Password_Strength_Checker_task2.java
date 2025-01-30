package level2_Programs;

import java.util.Scanner;
public class Password_Strength_Checker
{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Password Strength Checker***");
		
		System.out.println("Enter a password to check its strength: ");
		String password = sc.nextLine();
		
		int strength = passwordStrength(password);
		
		System.out.println("Password criteria based analysis:  ");
		if (strength <= 2)
		{
			System.out.println("Weak Password: Consider the messages and add the requirements\n");
			System.out.println("Password is too short, use atleast 8 characters.\n"+
					"Password should contain numbers.\n"+
					"Password should contain special characters.\n"+
					"Password should contain lowercase.\n"+
					"Password should contain uppercase");
			
		}
		else if(strength == 3)
		{
			System.out.println("Moderate Password: It could be more stronger");
		}
		else
		{
			System.out.println("Strong Password: Your password is know secure!");
		}
		
		
	}
			
	public static int passwordStrength(String password)
	{
		int strong = 0;
		if(password.length() >= 9)
		{
			strong++;
		}
		if(password.matches(".*[a-z].*"))
		{
			strong++;
		}
		if(password.matches(".*[A-Z].*"))
		{
			strong++;
		}
		if(password.matches(".*[!@#$%^&*(),.:{}<>].*"));
		{
			strong++;
		}
		if(password.matches(".*[0-9].*"))
		{
			strong++;
		}
		return strong;
	}
}