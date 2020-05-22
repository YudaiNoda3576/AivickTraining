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
//					predicate eは各リスト要素、右には条件
					.filter(e -> e % 2 == 0)
					.collect(Collectors.toList());
		}

//		replicateメソッド
		public static List<String> replicate(int arrayLength, String value) {
//			rangeの指定した値は含まない
			return IntStream.range(0, arrayLength)
//					整数をvalue型に変換
					.mapToObj(i -> value)
					
					.collect(Collectors.toList());
			 
		}

//		zipメソッド
		public static List<Pair<Integer, Integer>> zip(List<Integer> first, List<Integer> second) {
			int min = Math.min(first.size(), second.size());
			return IntStream.range(0, min)
					.mapToObj(i -> new Pair<>(first.get(i), second.get(i)))
					.collect(Collectors.toList());
		}

//		factorsメソッド
		public static List<Integer> factors(int num) {
			return IntStream.range(1, num + 1)
					.filter(i -> num % i == 0)
					.mapToObj(i -> Integer.valueOf(i))
					.collect(Collectors.toList());
		}

		
		public static List<Integer> perfects(int num) {
//			ラムダ式でリファクタリング
			return (List<Integer>) IntStream.range(1, num + 1) 
					.mapToObj(i -> new Pair<Integer, List<Integer>>(i, factors(i)))
					.filter(p -> totals(p.getSecond(), p.getFirst()) == p.getFirst())
//					.map(x -> x.getFirst())
					.map(Pair::getFirst)
					.collect(Collectors.toList());
					
		}
		
		public static int totals(List<Integer> intList, int exclusive) {
			return intList.stream()
					.filter(i -> i != exclusive)
//					メソッド参照を用いない書き方は↓
//					.mapToInt(i -> Integer.valueOf(i))
					.mapToInt(Integer::valueOf)
//					終了処理
					.sum();
		}


		public static List<Pair<Integer, Integer>> pairs(List<Integer> list) {
			return IntStream.range(0, list.size() - 1)
					.mapToObj(i -> new Pair<>(list.get(i), list.get(i + 1)))
					.collect(Collectors.toList());
		}

		public static boolean sorted(List<Integer> intList) {
			return pairs(intList)
					.stream()
					.noneMatch(p -> p.getFirst() > p.getSecond());
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
//					mapToIntにしないといけない
					.mapToInt(p -> p.getFirst() * p.getSecond())
					.sum();
					
		}

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


