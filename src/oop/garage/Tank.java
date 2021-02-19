package oop.garage;

public class Tank extends Vehicle {

	private int guns;

	public Tank(String colour, int mileage, int age, int guns) {
		super(colour, mileage, age);
		this.setGuns(guns);
	}

	@Override
	public String toString() {
		return "Tank [guns=" + guns + ", getId()=" + getId() + ", getColour()=" + getColour() + ", getMileage()="
				+ getMileage() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public float calcBill() {
		return guns * 500;
	}

	public int getGuns() {
		return guns;
	}

	public void setGuns(int guns) {
		this.guns = guns;
	}

}
