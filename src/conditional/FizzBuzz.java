package conditional;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(5));
		System.out.println(fizzBuzz(3));
		System.out.println(fizzBuzz(-54353453));

	}

	public static String fizzBuzz(int num) {
		String result = "";

		if (num % 3 == 0) {
			result = result + "Fizz";
		}
		if (num % 5 == 0) {
			result += "Buzz";
		}
		if (result.isBlank()) {
			result += num;
		}
		return result;
	}
}
