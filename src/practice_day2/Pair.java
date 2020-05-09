package practice_day2;

import java.util.ArrayList;
import java.util.List;

public class Pair {
	Pair() {
	}
// 構造体の設定
	static ArrayList<Pairs>array = new ArrayList<Pairs>();
//	リストに値を格納する変数です
	public void setNum() {
		array.add(setArray(1, 2));
	}
//	構造体に値をセットする変数です
	private Pairs setArray(int first, int second) {
		Pairs pair = new Pairs();
		pair.first = first;
		pair.second = second;
		return pair;
	}

	public static void main(String[] args) {
		Pair pair = new Pair();
		pair.setNum();
		for(int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i).first + "," + array.get(i).second);
		}
	}
//　構造体の内部クラス
	public class Pairs {
		int first;
		int second;
	}
}
