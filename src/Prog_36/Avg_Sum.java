package Prog_36;

import java.util.Scanner;

public class Avg_Sum {
public static void main(String[] args) {
	int a, b, sum;
	float avg;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Value for a");
	a = in.nextInt();
	System.out.println("Enter a Value for b");
	b = in.nextInt();
	sum = a+b;
	System.out.println("Sum = "+sum);
	avg = sum/2;
	System.out.println("Avrage = "+avg);
}
}
