package homework3;

public class Plus implements Calculator {

	@Override
	public int calc(String opr, int num1, int num2) {
		return num1 + num2;
	}
}
