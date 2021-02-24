package oop.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> items = new ArrayList<>();

	private List<Member> members = new ArrayList<>();

	public boolean addItem(Item item) {
		return this.items.add(item);
	}

	public boolean removeItem(int itemId) throws ItemNotFoundException {
		return this.items.remove(this.getItemById(itemId));
	}

	public Item getItemById(int itemId) throws ItemNotFoundException {
		for (Item i : this.items) {
			if (i.getId() == itemId) {
				return i;
			}
		}
		throw new ItemNotFoundException();
	}

	public boolean returnItem(int itemId, int memberId) throws ItemNotFoundException {
		Item itemToReturn = this.getItemById(itemId);
		Member memberReturning = this.getMemberById(memberId);

		if (itemToReturn == null || memberReturning == null || itemToReturn.isAvailable()) {
			return false;
		}

		itemToReturn.setAvailable(true);
		memberReturning.returnItem(itemToReturn);
		return true;
	}

	public boolean checkOutItem(int itemId, int memberId) throws ItemNotFoundException {
		Item itemToCheckOut = this.getItemById(itemId);
		Member memberCheckingOut = this.getMemberById(memberId);

		if (itemToCheckOut == null || memberCheckingOut == null || !itemToCheckOut.isAvailable()) {
			return false;
		}

		itemToCheckOut.setAvailable(false);
		memberCheckingOut.checkOut(itemToCheckOut);
		return true;
	}

	public boolean registerMember(Member member) {
		return this.members.add(member);
	}

	public Member getMemberById(int memberId) {
		for (Member m : this.members) {
			if (m.getId() == memberId) {
				return m;
			}
		}
		throw new MemberNotFoundException();
	}

	public boolean removeMember(int memberId) {
		return this.members.remove(this.getMemberById(memberId));
	}
}
