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
