package homework3;
public class MenuTypeSpec implements MenuSpec {

	@Override
	public boolean satisfiedBy(Menu menu) {
		return menu.getType().equals(this.menutype);
	}

	private String menutype;

	public MenuTypeSpec(String numutype) {
		this.menutype = menutype;
	}

}
