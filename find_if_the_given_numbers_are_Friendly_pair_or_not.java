package java_first;

import java.util.Scanner;

public class find_if_the_given_numbers_are_Friendly_pair_or_not {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number : ");				
		int number1 = sc.nextInt();
		System.out.print("Enter Second number : ");				
		int number2 = sc.nextInt();
		 
		int add1 = 0, add2 = 0;
		
		for(int i = 1 ; i < number1 ; i++)
		{
			if(number1 % i == 0)
				add1 = add1 + i;
		}
		
		for(int i = 1 ; i < number2 ; i++)
		{
			if(number2 % i == 0)
				add2 = add2 + i;
		}
		
		if(number1 == add2 && number2 == add1)
			System.out.println("Number is Friendly Pair");
		else
			System.out.println("Number is not Friendly Pair");
		
		sc.close();													
	}
}


