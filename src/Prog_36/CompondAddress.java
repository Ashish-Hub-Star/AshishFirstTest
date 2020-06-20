package Prog_36;

import java.util.Scanner;

public class CompondAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double PA, IR, TP, CI;
Scanner in = new Scanner(System.in);
System.out.println("Enter a Value for principle amount");
PA = in.nextDouble();
System.out.println("Enter a Value for Intrest rate");
IR = in.nextDouble();
System.out.println("Enter a Value for Time period");
TP = in.nextDouble();

CI = Math.pow((1 + IR/100),TP);
System.out.println("Compond interest is = "+ CI);
}

}
