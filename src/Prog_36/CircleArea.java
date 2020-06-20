package Prog_36;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		int Redius;
		float area;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Value for Redius");
		Redius = in.nextInt();
		area = (float) (Math.PI * Redius * Redius);
		
		System.out.println("Area of circle is ="+area);
	}

}
