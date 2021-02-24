package oop.library;

public class Magazine extends Item implements Readable {

	private int numberOfAds;

	public Magazine(String name, int numberOfAds) {
		super(name);
		this.numberOfAds = numberOfAds;
	}

	public int getNumberOfAds() {
		return numberOfAds;
	}

	public void setNumberOfAds(int numberOfAds) {
		this.numberOfAds = numberOfAds;
	}

	@Override
	public void read() {
		System.out.println("OMG, what's going on with Posh and Beck today?!!111!");

	}

}
