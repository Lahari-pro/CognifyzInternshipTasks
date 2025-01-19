package level1_Programs;

import java.util.Scanner;
public class Temperature_Convertor_Task1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				
				System.out.println(" ***Temperature Convertor*** ");
				System.out.println("--------------------------------");
				
				System.out.println("Enter the temperature value for conversion: ");
				double value = sc.nextDouble();
				
				System.out.println("Enter the unit of measurement: ");
				System.out.println("***C is for Celsius Conversion*** ");
				System.out.println("***F is for Fahrenheit Conversion***");
				
				System.out.println("Enter the unit: ");
				char select = sc.next().toUpperCase().charAt(0);
				double convertedTemperature = 0;
				String convertedUnit = null;
				
				if(select == 'C')
				{
					convertedTemperature = (value * 9 / 5) + 32;
					convertedUnit = "Fahrenheit";
				}
				else if(select == 'F')
				{
					convertedTemperature = (value - 32) * 5 / 9;
					convertedUnit = "Celsius";
				}
				else
				{
					System.out.println("Invalid unit of measuremnet.");
					System.out.println("!!!!Please enter 'C' or 'F'!!!!");
				}
				System.out.printf("Converted Temperature: %.2f %s%n", convertedTemperature, convertedUnit);
	}

}
