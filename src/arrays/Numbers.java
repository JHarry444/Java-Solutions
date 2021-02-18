package arrays;

public class Numbers {

	public static String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	public static String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convertToText(int number) {
		if (number < 1 || number > 100) {
			return "Out of range!";
		} else if (number < 20) {
			return units[number];
		} else {
			int firstDigit = number / 10;
			int secondDigit = number % 10;

			String output = "";

			output += tens[firstDigit];

			if (secondDigit != 0) {
				output += "-" + units[secondDigit];
			}

			return output;
		}
	}

	public static void main(String[] args) {

		System.out.println(convertToText(74));

		for (int i = 0; i < 100; i++) {
			System.out.println(convertToText(i));
		}

	}

}
