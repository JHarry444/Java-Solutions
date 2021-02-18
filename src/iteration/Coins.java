package iteration;

public class Coins {

	public static void main(String[] args) {
		calcChange(2000, 458);

	}

	public static void calcChange(int spent, int price) {
		if (spent < 0 || price < 0)
			return;

		int change = spent - price;

		int twenties = 0;
		int tenners = 0;
		int fivers = 0;
		int twoPounds = 0;
		int pounds = 0;
		int fiftyPences = 0;
		int twentyPences = 0;
		int tenPences = 0;
		int fivePences = 0;
		int twoPences = 0;
		int onePences = 0;

		while (change >= 2000) {
			change -= 2000;
			twenties++;
		}
		while (change >= 1000) {
			change -= 1000;
			tenners++;
		}
		while (change >= 500) {
			change -= 500;
			fivers++;
		}
		while (change >= 200) {
			change -= 200;
			twoPounds++;
		}
		while (change >= 100) {
			change -= 100;
			pounds++;
		}
		while (change >= 50) {
			change -= 50;
			fiftyPences++;
		}
		while (change >= 20) {
			change -= 20;
			twentyPences++;
		}
		while (change >= 10) {
			change -= 10;
			tenPences++;
		}
		while (change >= 5) {
			change -= 5;
			fivePences++;
		}
		while (change >= 2) {
			change -= 2;
			twoPences++;
		}
		while (change >= 1) {
			change -= 1;
			onePences++;
		}

		System.out.println("£20: " + twenties);
		System.out.println("£10: " + tenners);
		System.out.println("£5: " + fivers);
		System.out.println("£2: " + twoPounds);
		System.out.println("£1: " + pounds);
		System.out.println("50p: " + fiftyPences);
		System.out.println("20p: " + twentyPences);
		System.out.println("10p: " + tenPences);
		System.out.println("5p: " + fivePences);
		System.out.println("2p: " + twoPences);
		System.out.println("1p: " + onePences);
	}

}
