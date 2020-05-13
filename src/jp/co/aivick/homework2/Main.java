package jp.co.aivick.homework2;

import java.util.List;

import practice_day2.ListUtil;

class Main {

	public static void main(String[] args) {
		Pair<Integer, Integer> pair1 = new Pair<>(1, 2);

		System.out.println(pair1.getFirst() + "," + pair1.getSecond());
		System.out.println(pair1.toString());

//		evensofメソッド
		var intList = List.of(1, 2, 3, 4, 5, 6);

		var evensList = ListUtil.evensof(intList);

		for (Integer e : evensList) {
			System.out.println(e);
		}

//		replicateメソッド
		var hogeList = ListUtil.replicate(3, "hoge");
		System.out.println(hogeList);

//		zipメソッド
		var pair = ListUtil.zip(List.of(1, 2, 3), List.of(2, 3, 4));
		System.out.println(pair);

//		factorsメソッド
		var factors = ListUtil.factors(7);
		System.out.println(factors);

//		perfectsメソッド
		var perfects = ListUtil.perfects(500);
		System.out.println(perfects);

//		pairsメソッド
		var pairs = ListUtil.pairs(List.of(1, 2, 3, 4));
		System.out.println(pairs);

	}

}
