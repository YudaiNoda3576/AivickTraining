package practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FruitsAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		Map<String, Integer>fruits = new HashMap<>();
			fruits.put("りんご", 200);
			fruits.put("バナナ", 100);
			fruits.put("みかん", 150);
			fruits.put("ぶどう", 300);
			fruits.put("もも", 400);			
			
		System.out.println("以下のフルーツの名前を複数入力してください。平均価格を表示します。区切り文字には「,」を使用してください");
		System.out.println("りんご、バナナ、みかん、ぶどう、もも");

		// 入力値が複数か判定するようにする		
		String[]fruit = scanner.next().split(",");		
		int sum = 0;
		
		for(int i = 0; i < fruit.length; i++) {
			sum += fruits.get(fruit[i]);
		}
		System.out.println(sum / fruit.length);
	}
}