package conditional;

public class Taxes {

//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax

	public static void main(String[] args) {
		System.out.println("£" + taxPayment(50000));
	}

	public static double calcPercentage(int salary) {
		if (salary > 0 && salary < 15000) {
			return 0.0;
		} else if (salary >= 15000 && salary < 20000) {
			return 0.1;
		} else if (salary >= 20000 && salary < 30000) {
			return 0.15;
		} else if (salary >= 30000 && salary < 45000) {
			return 0.2;
		} else if (salary >= 45000) {
			return 0.25;
		} else {
			return Double.POSITIVE_INFINITY;
		}
	}

	public static double taxPayment(int salary) {
		double percentage = calcPercentage(salary);
		return salary * percentage;
	}

}
