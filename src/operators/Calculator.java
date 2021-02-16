package operators;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(12, 45));
		System.out.println(subtract(12, 45));
		System.out.println(multiply(12, 45));
		System.out.println(divide(12, 45));
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

}
