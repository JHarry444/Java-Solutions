package oop.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage1 = new Garage();

		garage1.addVehicle(new Car("Blue", 20_000, 2, 79));

		garage1.addVehicle(new Tank("Green", 99_999, 37, 5));

		garage1.addVehicle(new Ambulance("White", 1_000_000, 34, 2));

		garage1.printVehicles();

		System.out.println(garage1.calcBill());

		garage1.removeVehicleById(2);

		garage1.printVehicles();

		garage1.removeByType("car");

		garage1.printVehicles();
	}
}
