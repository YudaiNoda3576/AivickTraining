package jp.co.aivick.homwork2;
//模範解答の模写です
import java.util.Objects;
//ジェネリクス（総称型）
//ジェネリッククラスの定義　タプル：複数かつ異なる要素に順序をつけて格納できるデータ構造
//　S,Tは仮型パラメータ　＝　型安全を保証する
public class Pair_pattern2<S, T> {
	private final S first;
	private final T second;
	
	public Pair_pattern2(S first, T second) {
		this.first = first;
		this.second = second;
	}
//	ジェネリックメソッド　＝　異なる型（型パラメータで表現）に対して同じ振舞いをするメソッド
	public S first() {
		return this.first;
	}
	
	public T second() {
		return this.second;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
//		なんらかの型の要素を持つListを表す。このような型を非境界ワイルドカード型
		Pair_pattern2<?, ?> pair = (Pair_pattern2<?, ?>) o;			
		return Objects.equals(first, second) &&
		Objects.equals(second, pair.second);
	}
//	equalsメソッドを実装した場合は、hashCodeメソッドも実装する必要がある
//	equalsメソッドの結果がtrueとなるオブジェクトは、hashCodeメソッド呼び出しの結果同じ値を返す必要がある。 
//	(equalsがfalseとなるオブジェクトが同じhashCodeの結果を返すことは、かまわない)
	@Override
	public int hashCode() {
//	
		return Objects.hash(first, second);
	}

}
