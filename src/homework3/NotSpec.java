package homework3;

public class NotSpec implements MenuSpec {
	private final MenuSpec spec;
	
	public NotSpec(MenuSpec spec) {
		this.spec = spec;
	}
	
	@Override
	public boolean satisfiedBy(Menu menu) {
		return !spec.satisfiedBy(menu);
	}

}
