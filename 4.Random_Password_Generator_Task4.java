package level1_Programs;

import java.util.Random;
import java.util.Scanner;

public class Random_Password_Generator 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("***Random Password Generator***");
		System.out.println("-------------------------------");;
		
		System.out.println("Enter the size of the  password : ");
		int length = sc.nextInt();
		
		if(length <= 0)
		{
			System.out.println("Size of the password should be greater than zero");
			return;
		}
		
		
		System.out.println("Instruction to create a strong password");
		
		System.out.println("Need special characters---If yes(true),if No(false) it...");;
		boolean specialChars = sc.nextBoolean();
		
		System.out.println("Need numbers--- If Yes(true), If No(false)....");
		boolean numbers = sc.nextBoolean();
		
		System.out.println("Need LowerCase letters---if Yes(true), If No(false)");
		boolean lowerCase = sc.nextBoolean();
		
		System.out.println("Need UpperCase letters---if Yes(true), if No(false)");
		boolean upperCase = sc.nextBoolean();
		
		String requiredPassword = generatePassword(length, specialChars, numbers, lowerCase, upperCase);
		System.out.println("Generated Password according to the user requirements:"+requiredPassword);
		
	}
		public static String generatePassword(int length, boolean specialChars, boolean numbers, boolean lowerCase, boolean upperCase)
		{
			String specialChars1 = "!@#$%^&*()_+-=[]{}|;:,.'<>?/";
			String numbers1 = "0123456789";
			String lowerCase1 = "abcdefghijklmnopqrstuvwxyz";
			String upperCase1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			StringBuilder characterPool = new StringBuilder();
			if(specialChars)
			{
				
				characterPool .append(specialChars1);
			}
			if(numbers)
			{
				characterPool .append(numbers1);
			}
			if(upperCase)
			{
				characterPool .append(upperCase1);
			}
			if(lowerCase)
			{
				characterPool .append(lowerCase1);
			}
		
		if(characterPool.length() == 0) {
			throw new IllegalArgumentException("type atleast one character to generate the password");
		}

		Random random = new Random();
		StringBuilder randomPassword = new StringBuilder();
		for(int i=0; i < length; i++)
		{
			int sequence = random.nextInt(characterPool.length());
			randomPassword.append(characterPool.charAt(sequence));
		}
		return randomPassword.toString();
		}
}
	