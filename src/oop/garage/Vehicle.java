package oop.garage;

public abstract class Vehicle {

	private int id;
	private String colour;
	private int mileage;
	private int age;

	public Vehicle(String colour, int mileage, int age) {
		super();
		this.colour = colour;
		this.mileage = mileage;
		this.age = age;
	}

	public abstract float calcBill();

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", colour=" + colour + ", mileage=" + mileage + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
