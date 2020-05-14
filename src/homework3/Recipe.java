package homework3;

public class Recipe {
	private final String name;
	private final double cal;
		
	public Recipe(String name, double cal) {
		this.name = name;
		this.cal = cal;
	}
	
	public String getName() {
		return name;
	}
	public double getCal() {
		return cal;
	}
	
}
