package homework3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class MenuSet {
	
	private final List<Menu> menus;

	public MenuSet(List<Menu> menus) {
		this.menus = Collections.unmodifiableList(menus);
	}
	
	public List<Menu> getMenus() {
		return menus;
	}
	
	public List<Menu> getMenusByType(String type) {
		List<Menu> anyTypeList = new ArrayList<Menu>();
		for(Menu menu : this.menus) {
			if(menu.getType().equals(type)) {
				anyTypeList.add(menu);
			}
		}
		return anyTypeList;
	}
	
	public List<Menu> getMenusOverCalorie(int cal) {
		List<Menu> overCalolieList = new ArrayList<Menu>();
		for(Menu menu : this.menus) {
			if(menu.getCal() >= cal) {
				overCalolieList.add(menu);
			}
		}
		return overCalolieList;
	}
	
	public List<Menu> getMenusBySpec(MenuSpec spec) {
		List<Menu> anySpecList = new ArrayList<Menu>();
		for(Menu menu : this.menus) {
			if(spec.satisfiedBy(menu) == true) {
				anySpecList.add(menu);
			}
		}
		return anySpecList;	
	}
}
