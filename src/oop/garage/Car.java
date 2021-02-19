package oop.garage;

public class Car extends Vehicle {

	private int bootSpace;

	public Car(String colour, int mileage, int age, int bootSpace) {
		super(colour, mileage, age);
		this.setBootSpace(bootSpace);
	}

	@Override
	public float calcBill() {
		return bootSpace * 20;
	}

	@Override
	public String toString() {
		return "Car [bootSpace=" + bootSpace + ", id=" + getId() + ", colour=" + getColour() + ", mileage="
				+ getMileage() + ", age=" + getAge() + "]";
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

}
