package homework3;


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