package homework3;

public class OrSpec implements MenuSpec {

	private final MenuSpec spec1;
	private final MenuSpec spec2;
		
	public OrSpec(MenuSpec spec1, MenuSpec spec2) {
		this.spec1 = spec1;
		this.spec2 = spec2;
	}
		
	@Override
	public boolean satisfiedBy(Menu menu) {
		return spec1.satisfiedBy(menu) || spec2.satisfiedBy(menu);
	}

}
