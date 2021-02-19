package oop.garage;

public class Ambulance extends Vehicle {

	private int patientCapacity;

	public Ambulance(String colour, int mileage, int age, int patientCapacity) {
		super(colour, mileage, age);
		this.setPatientCapacity(patientCapacity);
	}

	@Override
	public String toString() {
		return "Ambulance [patientCapacity=" + patientCapacity + ", getId()=" + getId() + ", getColour()=" + getColour()
				+ ", getMileage()=" + getMileage() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public float calcBill() {
		return 600 / patientCapacity * 20;
	}

	public int getPatientCapacity() {
		return patientCapacity;
	}

	public void setPatientCapacity(int patientCapacity) {
		this.patientCapacity = patientCapacity;
	}

}
