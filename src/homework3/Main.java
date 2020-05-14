package homework3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Recipe r1 = new Recipe("ハンバーグ", 200.5);
		Recipe r2 = new Recipe("目玉焼き", 120);
		Recipe r3 = new Recipe("ブロッコリー", 20);
		Recipe r4 = new Recipe("スパゲティ", 100);
		Recipe r5 = new Recipe("フライドポテト", 150);

		Menu menu = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));

		System.out.println(menu.getName()); // ハンバーグ弁当
		System.out.println(menu.getType()); // 洋食
		System.out.println(menu.getCal()); // 320.5
		System.out.println(menu.getRecipes().get(0).getName()); // ハンバーグ

		Menu menu1 = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2)); // r1とr2はレシピインスタンスとする
		Menu menu2 = new Menu("鮭弁当", "和食", List.of(r3, r4)); // r3とr4はレシピインスタンスとする
		MenuSet menuSet = new MenuSet(List.of(menu1, menu2));
		var menus = menuSet.getMenus(); // メニュー一覧を取得
		System.out.println();

		/*
		 * System.out.println("--------getMenusByType----------"); Menu menu1 = new
		 * Menu("ハンバーグ弁当", "洋食", List.of(r1, r2)); // r1とr2はレシピインスタンスとする Menu menu2 =
		 * new Menu("鮭弁当", "和食", List.of(r3, r4)); // r3とr4はレシピインスタンスとする Menu menu3 =
		 * new Menu("のり弁当", "和食", List.of(r4, r5)); // r4とr5はレシピインスタンスとする MenuSet
		 * menuSet = new MenuSet(List.of(menu1, menu2, menu3)); var menus =
		 * menuSet.getMenusByType("和食"); // menusは、menu2とmenu2のみのリスト
		 * System.out.println(menus);
		 */
	}

}
