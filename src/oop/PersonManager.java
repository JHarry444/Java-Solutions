package oop;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<>();

	public Person findPersonByName(String name) {
		for (Person person : people) {
			if (person.getName() == name) {
				return person;
			}
		}
		System.out.println("Could not find person with name: " + name);
		return null;
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}
}
