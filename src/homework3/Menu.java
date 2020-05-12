package homework3;

import java.util.List;

public class Menu {
	private String name;
	private String type;
	private List<Recipe> recipes;
	private double cal;
	
	public Menu(String name, String type, List<Recipe> recipes) {
		this.name = name;
		this.type = type;
		this.recipes = recipes;
	}

	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public double getCal() {
		return cal;
	}
	
	public static void main(String[] args) {
		Recipe r1 = new Recipe("ハンバーグ", 200.5);
		Recipe r2 = new Recipe("目玉焼き", 120);
		
		Menu menu = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));
		System.out.println(menu.getName()); //ハンバーグ
		System.out.println(menu.getType()); //洋食
		System.out.println(menu.getCal()); //320.5
		System.out.println(menu.getRecipes().get(0).getName()); //ハンバーグ
	}
	
}
