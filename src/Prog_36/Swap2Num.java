package Prog_36;

import java.util.Scanner;

public class Swap2Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Value for num1");
		num1 = in.nextInt();
		System.out.println("Enter a Value for num2");
		num2 = in.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Num1 = "+num1 + " & num2 = "+num2);
		
	}
}
