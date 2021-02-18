package oop;

public class Runner {

	public static void main(String[] args) {
		Person p1 = null;
		p1 = new Person("JH", 26, "Java Trainer");
		Person p2 = new Person("Nick", 26, "Weapon");

		PersonManager manager = new PersonManager();
		manager.addPerson(p1);
		manager.addPerson(p2);

//		manager.people.add(p1); bad encapsulation

		Person found = manager.findPersonByName("JH");
		found.print();
	}

}
