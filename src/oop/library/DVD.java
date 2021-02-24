package oop.library;

public class DVD extends Item {

	private int runtime;

	public DVD(String name, int runtime) {
		super(name);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
