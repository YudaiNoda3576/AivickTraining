package homework3;

import java.util.Collections;
import java.util.List;

public class MenuSet {
	
	private List<Menu>menus;

	public MenuSet(List<Menu> menus) {
		this.menus = Collections.unmodifiableList(menus);
	}
	
	public List<Menu> getMenus() {
		return menus;
	}
	
	public List<Menu> getMenusByType(String type) {
		return null;
	}
	
}

//プリミティブ型以外で"=="を使用すると、インスタンスが全く等しい場合のみしか適用されなくなる
