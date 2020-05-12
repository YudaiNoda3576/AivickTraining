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
	
	public static void main(String[] args) {
		Recipe r1 = new Recipe("ハンバーグ", 200.5);
		Recipe r2 = new Recipe("サーモン", 120);
		System.out.println( r1.getName());
		System.out.println( r2.getCal());
	}
	
}
