package Health;

public class assignment_7 {
	
	public boolean testMethod1() {
		Integer I1 = 100;
		Integer I2 = 100;
		return (I1 == I2);
	}

	public boolean testMethod2() {
		Integer j1 = 1000;
		Integer j2 = 1000;
		return (j1 == j2);
	}
	
	
	public static void main(String[] args) {
		assignment_7 ass = new assignment_7();
		
System.out.println("'I1 == I2' " + ass.testMethod1() + " and 'j1 == j2' is  " + ass.testMethod2());
	}
}
