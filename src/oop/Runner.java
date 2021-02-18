package oop;

public class Runner {

	public static void main(String[] args) {
		Person p1 = null;
		p1 = new Person("JH", 26, "Java Trainer");
		Person p2 = new Person("Nick", 26, "Weapon");

		p1.print();
		p2.print();

		PersonManager manager = new PersonManager();
		manager.addPerson(p1);
		manager.addPerson(p2);

		Person found = manager.findPersonByName("JH");
		found.print();
	}

}
