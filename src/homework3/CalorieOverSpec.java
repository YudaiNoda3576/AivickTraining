package homework3;

public class CalorieOverSpec implements MenuSpec {

	@Override
	public boolean satisfiedBy(Menu menu) {
		return true;
	}

	private int menucal;

	CalorieOverSpec(int menucal) {
		this.menucal = menucal;
	}
}
