package Prog_36;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Value for A");
		a = in.nextInt();
		System.out.println("Enter a Value for B");
		b = in.nextInt();
		System.out.println("Enter a Value for C");
		c = in.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>c && b>a) {
			System.out.println("B is greater");
		}
		else{
			System.out.println("c is greater");
		}
	}

}
