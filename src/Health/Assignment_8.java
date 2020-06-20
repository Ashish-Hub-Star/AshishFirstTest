package Health;

public class Assignment_8 {

	public void testMethod1(int i) {
		System.out.println("int");
	}

	public void testMethod1(float j) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		Assignment_8 ass = new Assignment_8();
		ass.testMethod1(10.5f);
		ass.testMethod1(10L);
		ass.testMethod1('a');
	}
	
}
