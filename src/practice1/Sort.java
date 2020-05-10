package practice1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int i = 0;
		int[] array = new int[args.length];
		for (String arg : args) {
			array[i] = Integer.parseInt(arg);
			i++;
		}
		Arrays.sort(array);
		for (int num : array) {
			System.out.println(num);
		}
	}
}