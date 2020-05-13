package jp.co.aivick.homwork2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PracticeOfRamda {
	public static void main(String[]args) {
//		Java8以前のコレクションをソートする匿名クラス
//		Java8以降はComparatorのような実装すべきメソッドが一つのインターフェイスのことを関数型インターフェイスという
//		関数型インターフェイスを実装したクラスの代わりにラムダ式を利用できる
		List<String>list1 = Arrays.asList("Java", "Scala", "Groovy");
		list1.sort(new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
//		上の処理をラムダ式で記述
		List<String> list2 = Arrays.asList("Java", "Scala", "Groovy");
		list2.sort((String s1, String s2) -> s1.length() - s2.length());
		
		
	}
	
}
