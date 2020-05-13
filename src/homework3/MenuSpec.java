package homework3;

public interface MenuSpec {
	public abstract boolean satisfiedBy(Menu menu);
}

class MenuTypeSpec implements MenuSpec {
	private String menutype;
	
	public MenuTypeSpec(String numutype) {
	  this.menutype = menutype;
	}
	
	@Override
	public boolean satisfiedBy(Menu menu) {
		return menu.getType().equals(this.menutype);
	}
}

class CalorieOverSpec implements MenuSpec {
	
	private int menucal;
	
	 CalorieOverSpec(int menucal) {
		 this.menucal = menucal;
	 }
	 
	 @Override
	 public boolean satisfyedBy(Menu menu) {
		 return(menu.getCal() > menucal);
	 }
	 
	 class AndSpec implements MenuSpec {
		 private MenuSpec spec1;
		 private MenuSpec spec2;
		 
		 AndSpec(MenuSpec spec1, MenuSpec spec2) {
			 this.spec1 = spec1;
			 this.spec2 = spec2;
		 }
		 
		 @Override
		 public boolean satisfiedBy(Menu menu) {
			 boolean a = spec1.satisfiedBy(menu);
			 boolean b = spec2.satisfiedBy(menu);
			 
			 return a && b;
		 }
	 }
}