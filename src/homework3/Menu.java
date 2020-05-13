package homework3;

import java.util.Collections;
import java.util.List;

public class Menu {
	private final String name;
	private final String type;
	private final List<Recipe> recipes;
	
	public Menu(String name, String type, List<Recipe> recipes) {
		this.name = name;
		this.type = type;
//		リストは中身の書き換えが起こり得る
//		Collections.unmodifiableList これで修正できないリストを作成する
		this.recipes = Collections.unmodifiableList(recipes);
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
		int sum = 0;
		for(Recipe recipe : this.recipes) {
			sum += recipe.getCal();
		}
		return sum;
	}
	
}
