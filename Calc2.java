public class Calc2 {
	public static void main(String[] args) {
		System.out.println("Calc2 operations..");
		
		int x = 10, y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Average = " + avg(x, y));
	}
	
	private static int avg(int a, int b) {
		return (a + b) / 2;
	}
}
