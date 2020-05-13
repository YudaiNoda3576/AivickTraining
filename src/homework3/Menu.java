package homework3;

import java.util.Collections;
import java.util.List;

public class Menu {
	private final String name;
	private final String type;
	private final List<Recipe> recipes;
//	private final double cal;
	
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
//		一度変数に代入した方が、パフォーマンスを考慮した書き方になる
		int size = recipes.size();
		for(int i = 0; i < size; i++) {
			sum += recipes.get(i).getCal();
		}
		return sum;
	}
	
}
