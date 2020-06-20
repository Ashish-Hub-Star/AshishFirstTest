package Prog_36;

public class ArraySmallLargeNumber {
public static void main(String[] args) {
	int arr [] = {10, 20, 30,90,140, 70, 2,90, 100};
	
	int small = arr[0];
	int large = arr[0];
	
	for(int i=0; i<arr.length;i++) {
		if(arr[i] < large) {
			large = arr[i];
		}
		
		if(arr[i] > small) {
			small = arr[i];
		}
	}
	System.out.println("Largest number in array is = "+large);
	System.out.println("Smallest number in array is = "+small);
		
}
}
