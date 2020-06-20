package Health;

public class Assesment_3 {

	public void testMethod1(int i1, int i2) {
		System.out.println("int - int");
	}

	public void testMethod1(int i, float f) {
		System.out.println("int - float");
	}

	public void testMethod1(float f, int i) {
		System.out.println("float - int");
	}

	public void testMethod1(float f1, float f2) {
		System.out.println("float - float");
	}

	public void testMethod1(float f, double d) {
		System.out.println("float - double");
	}

	public void testMethod1(double d1, double d2) {
		System.out.println("double - double");
	}
	
	public static void main(String[] args) {
		Assesment_3 a3 = new Assesment_3();
	a3.testMethod1(10.5f, 10.5);
	a3.testMethod1(10.5, 10.5);
	a3.testMethod1(10.5f, 10.5f);
	a3.testMethod1('a', 'b');
	a3.testMethod1('a', 10.5f);
	a3.testMethod1(10L, 10);
	}
}
