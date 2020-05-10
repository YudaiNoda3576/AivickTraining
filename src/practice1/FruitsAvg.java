package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitsAvg {

	public static void main(String[] args) {
		String [] fruitsName = args;
	
		Map<String, Integer>fruits = new HashMap<>();
			fruits.put("りんご", 200);
			fruits.put("バナナ", 100);
			fruits.put("みかん", 150);
			fruits.put("ぶどう", 300);
			fruits.put("もも", 400);			
			
		average(fruitsName, fruits);
		if(args.length == 0) {
			System.out.println("以下のフルーツの名前を複数入力してください。平均価格を表示します。");
			System.out.println("りんご、バナナ、みかん、ぶどう、もも");
		}
	}
	
	public static void average(String[]fruitsName, Map<String, Integer>fruits) {
		int sum = 0;
		double ave = 0;
		for(String fruitName : fruitsName) {
			sum += fruits.get(fruitName);
		}
		ave = sum / fruitsName.length;
		System.out.println(ave);
	}
}