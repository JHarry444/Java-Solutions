package oop.library;

public class Book extends Item implements Readable {

	private int noOfPages;

	public Book(String name, int noOfPages) {
		super(name);
		this.noOfPages = noOfPages;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public void read() {
		System.out.println("Check out my books, my books are amazing");
	}

}
