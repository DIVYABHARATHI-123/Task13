package task8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		//To find the number digits in a number
				Scanner sc = new Scanner(System.in);
				System.out.println("ENTER A NUMBER:");
				int Number = sc.nextInt();
				sc.close();
				int count = 0;
				while (Number > 0)
				{
					Number /=10;
					count++;
				}
				System.out.println("Number of digits :" +count);

	}

}
