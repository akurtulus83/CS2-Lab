package java_first;

import java.util.Scanner;

public class Calculate_The_Maximum_Number_of_handshakes {
	
	public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the maximum number of handshakes;");
        num = sc.nextInt();
        int total = num * (num-1) / 2; // Combination nC2
        System.out.print("The total number of handshakes possible:" + " " + total);
        sc.close();	
    }

}