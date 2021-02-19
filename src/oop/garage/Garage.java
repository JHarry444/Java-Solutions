package oop.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();
	private int vehicleCount = 1;

	public void printVehicles() {
		System.out.println(this.vehicles);
	}

	public boolean addVehicle(Vehicle vehicle) {
		vehicle.setId(vehicleCount++);
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}

	public boolean removeVehicleById(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				return this.removeVehicle(v);
			}
		}

		return false;
	}

	public boolean removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}

		return this.vehicles.removeAll(toRemove);
	}

	public void empty() {
		this.vehicles.clear();
	}

	public float calcBill() {
		float bill = 0.0F;
		for (Vehicle v : this.vehicles) {
			bill += v.calcBill();
		}
		return bill;
	}
}
