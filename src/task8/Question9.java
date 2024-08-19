package task8;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
	
		
		// to find the person is senior citizen or not
				// int age;
				Scanner sc = new Scanner(System.in);
				
				//sc.close();
				System.out.println("Enter your age :");
				int age = sc.nextInt();
				sc.close();
			
				
		  if(age >= 60)
		  {
			  System.out.println("The person is belongs to SeniorCitizen ");
			  
		  }
		  else
		  {
			  System.out.println("The person is general category");
			  
			  
			 
		  }
			  
			}

		}

	


