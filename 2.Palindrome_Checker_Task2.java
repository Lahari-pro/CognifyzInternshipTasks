package level1_Programs;

import java.util.*;

public class Palindrome_Checker_Task2
{
	public static void main(String[] args)
	{
		System.out.println("***Palindrome Checker***");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word or phrase(You Choice): ");
		String str = sc.nextLine();
		
		StringBuilder requiredString = new StringBuilder();
		for(char word: str.toCharArray())
		{
			if(Character.isLetterOrDigit(word))
			{
				requiredString.append(Character.toLowerCase(word));		
			}
		}
		if(isPalindromeChecker(requiredString))
		{
			System.out.println("Word or Phrase give by the user is a Palindrome");
		}
		else
		{
			System.out.println("Oops! the given Word or Phrase is not a Palindrome.. ");
		}
	}
	public static boolean isPalindromeChecker(StringBuilder requiredString)
	{
		int left = 0;
		int right = requiredString.length()-1;
		
		while(left < right )
		{
			if(requiredString.charAt(left) != requiredString.charAt(right))
			{
				return false;
			}
			else
			{
				left++;
				right--;
			}
			
		}
		return true;
	}	
}

