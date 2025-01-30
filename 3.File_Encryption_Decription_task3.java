package level2_Programs;

import java.io.*;
import java.util.Scanner;

public class FileEncryption_Decription
{
   public static void main(String []args)
   {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("File Encryption and Decryption ");
	   System.out.println("------------------------------");
	   
	   System.out.println("Choose an option 1..Encrypt\n 2..Decrypt\n");
	   String option = sc.nextLine().toLowerCase();
	   
	   if(!option.equals("encrypt") && !option.equals("decrypt"))
	   {
		   System.out.println("Invalid choice...Pleasse select 'encrypt' ot 'decrypt'");
		   return;
	   }
	   
	   System.out.println("Enter the path of the input file: ");
	   String inputPath = sc.nextLine();
	   
	   System.out.println("Enter the path of output file");
	   String outputPath = sc.nextLine();
	   
	   System.out.println("Enter the encryption key(integer): ");;
	   int inputKey = sc.nextInt();
	   
	   if(option.equals("decrypr"))
	   {
		   inputKey = -inputKey;
	   }
	   
	   try
	   {
		   processFile(inputPath, outputPath, inputKey);
		   System.out.println("File "+option+"added successfully. output saved to the OutputPath");
	   }
	   catch(IOException e)
	   {
		   System.out.println("Oops! error encountered...."+e.getMessage());
	   }
   }

   private static void processFile(String inputPath, String outputPath, int inputKey) throws IOException

   {
	   try(BufferedReader reader = new BufferedReader(new FileReader(inputPath));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath)))
	   {
		   String line;
		   while((line = reader.readLine()) != null)
		   {
			   String lineProcessing = processLine(line, inputKey);
			   writer.write(lineProcessing);
			   writer.newLine();
		   }
	   }
	
   }

   private static String processLine(String line, int inputKey) 
   {
	StringBuilder outline = new StringBuilder();
	for( char c: line.toCharArray())
	{
		if(Character.isLetter(c))
		{
			char value = Character.isLowerCase(c) ? 'a' : 'A';
			c =  (char) ((c- value+inputKey+26) % 26 + value);
		}
		outline.append(c);
	}
	return outline.toString();
   }
}