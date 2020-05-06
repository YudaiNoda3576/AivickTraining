package practice1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Average {

	public static void main(String[] args) {
		double num1 = 1;
		double num2 = 2;
		double num3 = 4;
		double num4 = 20;
		
		double ave1 = (num1 + num2) / 2;
		double ave2 = (num2 + num3 + num4) / 3;
		
		BigDecimal bd = new BigDecimal(ave2);
		BigDecimal bd1 = bd.setScale(1, RoundingMode.UP);
		
		System.out.println(ave1);
		System.out.println(bd1.doubleValue());	
	}
}
