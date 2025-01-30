package level1_Programs;

import java.util.Scanner;
public class Student_Grade_Calculator 
{
	public static void main (String []args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("***Student Grade Calculator***");
		
		System.out.println("Enter the numbers of gardes to calculate: ");
		int gradesCount=sc.nextInt();
		
		if(gradesCount <= 0)
		{
			System.out.println("Please enter the grades greater than zero");
			return;
		}
		
		double[] gradeValues = new double[gradesCount];
		double sumOfGrades=0;
		for(int i=0;i<gradesCount;i++)
		{
			System.out.println("Enter grade "+(i+1) + ":");
			gradeValues[i] = sc.nextDouble();
			
			if(gradeValues[i] < 0 || gradeValues[i]>100)
			{
				System.out.println("Invalid grades! Please enter the grade values between 0 and 100)");
				i--;
				continue;
			}
			sumOfGrades += gradeValues[i];
		}
		
		double averageScore = sumOfGrades/gradesCount;
		
		System.out.println("\n***Results*** ");
		System.out.printf("Grades entered by the student: ");
		for(double grades : gradeValues)
		{
			System.out.printf("%.2f\n",grades);
		}
		
		System.out.printf("\nAverage grade secured by the student: %.2f%n",averageScore);
		
	}
}
