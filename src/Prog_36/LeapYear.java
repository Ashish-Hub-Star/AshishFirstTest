package Prog_36;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Value for Year");
		year = in.nextInt();
		
		if((year % 400 == 0) || (year % 100 == 0 && year %4 == 0)) {
			System.out.println("Entered yeat = "+year+" is leap year");
		}else {
			System.out.println("Entered yeat = "+year+" is not leap year");
		}
	}

}
