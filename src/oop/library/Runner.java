package oop.library;

public class Runner {

	public static void main(String[] args) {
		Library library = new Library();

		library.addItem(new Book("LotR", 3000));
		library.addItem(new DVD("Kill Bill", 120 * 60));
		library.addItem(new Magazine("OK", 9999));

		library.registerMember(new Member("JH"));
		library.registerMember(new Member("Nick"));

		library.checkOutItem(1, 1);

		System.out.println(library.getMemberById(1));

		System.out.println(library.checkOutItem(1, 2));

		System.out.println(library.getMemberById(2));

		library.checkOutItem(2, 1);

		System.out.println(library.getMemberById(1));

		library.returnItem(1, 1);

		System.out.println(library.getMemberById(1));
	}

}
