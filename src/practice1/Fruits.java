package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		frp(null);
		frpAve(null);
	}
	
		public static int frp(String fruitName) {
		Scanner scanner = new Scanner(System.in);
		int fruitsPrice = 0;
		
		Map<String, Integer>fruits = new HashMap<>();
			fruits.put("りんご", 200);
			fruits.put("バナナ", 100);
			fruits.put("みかん", 150);
			fruits.put("ぶどう", 300);
			fruits.put("もも", 400);			
			
		System.out.println("以下のフルーツ名を入力してください。価格を表示します。");
		System.out.println("りんご、バナナ、みかん、ぶどう、もも");
		
		String fruit = scanner.next();
		System.out.println(fruit + "は" + fruits.get(fruit) + "円です");
		
		return fruitsPrice;
	 }
		
		public static double frpAve(String fruitName) {
			Scanner scanner = new Scanner(System.in);
			double fruitsPriceAve = 0;
			
			Map<String, Integer>fruits = new HashMap<>();
				fruits.put("りんご", 200);
				fruits.put("バナナ", 100);
				fruits.put("みかん", 150);
				fruits.put("ぶどう", 300);
				fruits.put("もも", 400);		
	
			System.out.println("以下のフルーツ名を2つ以上入力してください。平均価格を表示します。");
			System.out.println("りんご、バナナ、みかん、ぶどう、もも");
			
			String fruit = scanner.next();
			
			return fruitsPriceAve;
		}
		
		
	

}
