public class Calc1 {
	public static void main(String[] args) {
		System.out.println("Calc1 operations..");
		
		int x = 10, y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Subtraction = " + sub(x, y));
		System.out.println("Addition = " + add(x, y));
	}
	
	private static int sub(int a, int b) {
		return a – b;
	}

	private static int add(int a, int b) {
		return a + b;
	}
}