package oop.library;

public abstract class Item {

	private final int id;

	private static int count = 0;

	private boolean available = true;

	private String name;

	public Item() {
		this("DEFAULT");
	}

	public Item(String name) {
		super();
		this.id = ++count;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", available=" + available + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
