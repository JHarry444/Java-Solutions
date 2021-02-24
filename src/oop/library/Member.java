package oop.library;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private List<Item> checkedOut = new ArrayList<>();

	private final int id;

	private static int count = 0;

	private String name;

	public Member(String name) {
		super();
		this.id = ++count;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [checkedOut=" + checkedOut + ", id=" + id + ", name=" + name + "]";
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

	public boolean checkOut(Item i) {
		return this.checkedOut.add(i);
	}

	public boolean returnItem(Item i) {
		return this.checkedOut.remove(i);
	}
}
