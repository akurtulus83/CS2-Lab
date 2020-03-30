package java_first;


import java.util.Scanner;


public class count_number_of_digit_in_integer {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Count = 0;
		
		System.out.println("Enter a number:");
		
		int number = sc.nextInt();
		
		while(number>0) {
			number=number/10;
			Count++;
		}
		
		System.out.println("Number of digit in number:" + Count);
		
		sc.close();
	}
}
