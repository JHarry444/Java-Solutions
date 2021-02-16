package operators;

public class Results {

	public static int physics;
	public static int chemistry;
	public static int biology;
	
	public static int total;
	public static double percentage;
	
	public static void main(String[] args) {
		physics = 45;
		chemistry = 34;
		biology = 47;
		
		total = physics + chemistry + biology;
		
		System.out.println(getResults());
		getPercentage();
		
	}
	
	public static String getResults() {
		return "Physics:" + physics + " Chemistry:" + chemistry + " Biology:" + biology + " Total:" + total;
	}
	
	public static void getPercentage() {
		percentage = total / 150.0 * 100;
		System.out.println("Percentage: " + percentage);
	}
}
