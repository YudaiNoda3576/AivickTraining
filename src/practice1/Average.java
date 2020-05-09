package practice1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		for (String arg : args) {
			sum += Integer.parseInt(arg);
		}
		
		double average = sum / args.length;
		
		System.out.println(average);
	}
}
