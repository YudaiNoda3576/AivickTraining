package jp.co.aivick.homework2;

import java.awt.font.NumericShaper.Range;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.sun.net.httpserver.Authenticator.Result;
import jp.co.aivick.homework2.Pair;


public class ListUtilOfRambda {

		public static void main(String[] args) {
			System.out.println("-----------evensof-------------");
			var intList = List.of(1, 2, 3, 4, 5, 6);

			var evensList = ListUtilOfRambda.evensof(intList);

			for (Integer e : evensList) {
				System.out.println(e);
			}

			System.out.println("-----------replicate-------------");
			var hogeList = ListUtilOfRambda.replicate(3, "hoge");
			System.out.println(hogeList);

			System.out.println("-----------zip-------------");
			var pair = ListUtilOfRambda.zip(List.of(1, 2, 3), List.of(2, 3, 4));
			System.out.println(pair);

			System.out.println("-----------factors-------------");
			var factors = ListUtilOfRambda.factors(7);
			System.out.println(factors);

			System.out.println("-----------perfect-------------");
			var perfects = ListUtilOfRambda.perfects(500);
			System.out.println(perfects);
			
			System.out.println("-----------total-------------");
			var total = ListUtilOfRambda.totals(List.of(10,20,10,30,40), 10);
			System.out.println(total);

			System.out.println("-----------pairs-------------");
			var pairs = ListUtilOfRambda.pairs(List.of(1, 2, 3, 4));
			System.out.println(pairs);

			System.out.println("-----------sorted-------------");
			var pairs1 = ListUtilOfRambda.sorted(List.of(1, 2, 3, 4));
			System.out.println(pairs1);

			System.out.println("-----------positions-------------");
			var indexes = ListUtilOfRambda.positions(10, List.of(10, 13, 10, 12, 10, 10));
			System.out.println(indexes);

			System.out.println("-----------scalarProduct-------------");
			var totals = ListUtilOfRambda.scalarProduct(List.of(1, 2, 3), List.of(4, 5, 6));
			System.out.println(totals);
		}

//		ラムダ式を用いてリファクタリングの練習
//		evensofメソッド
		public static List<Integer> evensof(List<Integer> intList) {
			return intList.stream()
//					eは各リスト要素、右には条件
//					Stream<T> filter(Predicate<? super T> predicate（述語）)
//					このストリームの要素のうち、指定された述語に一致するものから構成されるストリームを返します。
//					要するに条件に合致したものを抽出する
					.filter(e -> e % 2 == 0)
					
					.collect(Collectors.toList());
		}

//		replicateメソッド
		public static List<String> replicate(int arrayLength, String value) {
//			rangeの指定した値は含まない
//			順次および並列の集約操作をサポートするプリミティブint値要素のシーケンス（連続しているもののこと）です。これは、Streamに対してintプリミティブ特殊化を行ったものです。
			return IntStream.range(0, arrayLength)
//					数値をvalueに変換
//					<U> Stream<U> mapToObj(IntFunction<? extends U> mapper)
//					指定された関数をこのストリームの要素に適用した結果から構成される、オブジェクト値のStreamを返します。
					.mapToObj(i -> value)
					
					.collect(Collectors.toList());
			 
		}

//		zipメソッド
		public static List<Pair<Integer, Integer>> zip(List<Integer> first, List<Integer> second) {
//			小さいリストに合わせる為の変数
			int min = Math.min(first.size(), second.size());
//			リストの長さ分streamを回せばいいので
			return IntStream.range(0, min)
//					i = streamで回っているint 型の数値　Pairインスタンスをnewしてfirst,secondから値を取り出して格納
					.mapToObj(i -> new Pair<>(first.get(i), second.get(i)))
//					リストで返す
					.collect(Collectors.toList());
		}

//		factorsメソッド
		public static List<Integer> factors(int num) {
//			約数を求めるので自身の数も含める
			return IntStream.range(1, num + 1)
//					streamが回っている間ずっと以下の計算を行っている
					.filter(i -> num % i == 0)
//					最終的に返す値はInteger型だが、ここではiはまだint型のままなので
					.mapToObj(i -> Integer.valueOf(i))
//				    .boxed()
//					リストにして返す
//					https://docs.oracle.com/javase/jp/8/docs/api/java/util/stream/Collectors.html
					.collect(Collectors.toList());
		}

//		完全数（かんぜんすう，英: perfect number）とは、その数自身を除く約数の和が、その数自身と等しい自然数のことである。
//		例えば 6 (= 1 + 2 + 3)、28 (= 1 + 2 + 4 + 7 + 14) や496が完全数である。
		public static List<Integer> perfects(int num) {
//			約数と同様
			return (List<Integer>)IntStream.range(1, num + 1) 
//					iには引数(例1~500)が入り、Pair<Integer, List<Integer>(1~500, 1~500の約数)>でそれぞれのケースを考える
					.mapToObj(i -> new Pair<Integer, List<Integer>>(i, factors(i)))
//					pはPair　完全数　＝　i自身をのぞいた約数の和が、iと等しい時完全数である
					.filter(p -> totals(p.getSecond(), p.getFirst()) == p.getFirst())
//					.map(x -> x.getFirst())
					.map(Pair::getFirst)
					
					.collect(Collectors.toList());		
		}
		
//	　第二引数で指定した数値をリストからのぞいて合計を算出するメソッド
		public static int totals(List<Integer> intList, int exclusive) {
//			すでに存在するリストから抽出したいので
			return intList.stream()
					.filter(i -> i != exclusive)
//					メソッド参照を用いない書き方は↓
//					.mapToInt(i -> Integer.valueOf(i))　
//					Integerのままなので戻り値の型に合わせint型に変換する
					.mapToInt(Integer::valueOf)
//					終了処理 要素の合計を返す
					.sum();
		}

// 一つのリストからペアリストを生成するメソッド
		public static List<Pair<Integer, Integer>> pairs(List<Integer> list) {

			return  IntStream.range(0, list.size() - 1)
//					i番目、i＋1番目の数値でペアを作成
					.mapToObj(i -> new Pair<>(list.get(i), list.get(i + 1)))
//					リスト化
					.collect(Collectors.toList());
		}

//		リストが昇順にソートされているか確認するメソッド
		public static boolean sorted(List<Integer> intList) {
			return pairs(intList).stream()
//					条件に対してboolean型の結果を返す
//								 .noneMatch(p -> p.getFirst() > p.getSecond());
								 .anyMatch(p -> p.getFirst() < p.getSecond());
		}

		public static List<Integer> positions(int num, List<Integer> intList) {
//			インデックス番号のリストを求める
			List<Integer>indexes = IntStream.range(0, intList.size())
//					Integerからint型に変換して
								 .boxed()
//								 リスト化　
								 .collect(Collectors.toList());
			
			return zip(indexes, intList).stream()
					
								   .filter(e -> e.getSecond() == num)
//								   残ったインデックス番号でmap化
							       .map(Pair::getFirst)
							       
								   .collect(Collectors.toList());
		}

//		scalarProductメソッド
		public static int scalarProduct(List<Integer> v1, List<Integer> v2) {
//			二つの要素をペアにしてとじあわせる
			return ListUtil.zip(v1, v2).stream()
//					Integerで受け取っているのでmapToIntにしないといけない
					.mapToInt(p -> p.getFirst() * p.getSecond())
					
					.sum();
					
		}

//		ラムダ式を用いる入りときは型に注意する必要がある
//		メソッドの引数にとらわれず、処理の流れとして何をしたいかに沿って記述するイメージの方がわかりやすい
//		複数処理を行って行くときは、どこでどの値がどう変換されているのか意識する必要がある
		
		
		
		
		
		
		
//		zip4メソッド
//		要検証
		public static List<Pair<Integer, Pair<Integer, Pair<Integer, Integer>>>> zip4(List<Integer> list1,
				List<Integer> list2, List<Integer> list3, List<Integer> list4) {

			var min = Math.min(Math.min(list1.size(), list2.size()), Math.min(list3.size(), list4.size()));
			List<Pair<Integer, Pair<Integer, Pair<Integer, Integer>>>> result = new ArrayList<>();
			for (int i = 0; i < min; i++) {
				result.add(tetrad(list1.get(i), list2.get(i), list3.get(i), list4.get(i)));
			}
			return result;
		}

		private static Pair<Integer, Pair<Integer, Pair<Integer, Integer>>> tetrad(Integer a, Integer b, Integer c,
				Integer d) {
			return new Pair<>(a, new Pair<>(b, new Pair<>(c, d)));
		}
	}


