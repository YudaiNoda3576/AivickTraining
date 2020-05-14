package jp.co.aivick.homework2;

import java.util.ArrayList;
import java.util.List;
import jp.co.aivick.homework2.Pair;


public class ListUtil {

	public static void main(String[] args) {
		System.out.println("-----------evensof-------------");
		var intList = List.of(1, 2, 3, 4, 5, 6);

		var evensList = ListUtil.evensof(intList);

		for (Integer e : evensList) {
			System.out.println(e);
		}

		System.out.println("-----------replicate-------------");
		var hogeList = ListUtil.replicate(3, "hoge");
		System.out.println(hogeList);

		System.out.println("-----------zip-------------");
		var pair = ListUtil.zip(List.of(1, 2, 3), List.of(2, 3, 4));
		System.out.println(pair);

		System.out.println("-----------factors-------------");
		var factors = ListUtil.factors(7);
		System.out.println(factors);

		System.out.println("-----------perfect-------------");
		var perfects = ListUtil.perfects(500);
		System.out.println(perfects);

		System.out.println("-----------pairs-------------");
		var pairs = ListUtil.pairs(List.of(1, 2, 3, 4));
		System.out.println(pairs);

		System.out.println("-----------sorted-------------");

	}

//	evensofメソッド
	public static List<Integer> evensof(List<Integer> intList) {
		List<Integer> evensList = new ArrayList<>();
		for (Integer e : intList) {
			if (e % 2 == 0) {
				evensList.add(e);
			}
		}
		return evensList;
	}

//	replicateメソッド
	public static List<String> replicate(int arrayLength, String value) {
		List<String> hogeList = new ArrayList<>();
		for (int i = 0; i < arrayLength; i++) {
			hogeList.add(value);
		}
		return hogeList;
	}

//	zipメソッド
	public static List<Pair<Integer, Integer>> zip(List<Integer> first, List<Integer> second) {
		List<Pair<Integer, Integer>> pair = new ArrayList<>();
		int min_size = Math.min(first.size(), second.size());

		for (int i = 0; i < min_size; i++) {
			Pair<Integer, Integer> value = new Pair<>(first.get(i), second.get(i));
			pair.add(value);
		}
		return pair;
	}

//	factorsメソッド
	public static List<Integer> factors(int num) {
		List<Integer> factors = new ArrayList<>();
		for (int factor = 1; factor <= num; factor++) {
			if (num % factor == 0) {
				factors.add(factor);
			}
		}
		return factors;
	}

//	perfectsメソッド
	public static List<Integer> perfects(int num) {
		List<Integer> perfects = new ArrayList<>();
		for (int i = 1; i < num; i++) {
			int sum = 0;
			List<Integer> factors = ListUtil.factors(i);
			for (int factor : factors) {
				sum += factor;
			}
			if (sum - i == i) {
				perfects.add(i);
			}
		}
		return perfects;
	}

	public static List<Pair<Integer, Integer>> pairs(List<Integer> list) {
		List<Pair<Integer, Integer>> pairs = new ArrayList<>();
		for (int i = 0; i < list.size() - 1; i++) {
			pairs.add(new Pair<>(list.get(i), list.get(i + 1)));
		}
		return pairs;
	}

	public static boolean sorted(List<Integer> intList) {
		var pairs = pairs(intList);
		for (var pair : pairs) {
			if (pair.getFirst() > pair.getSecond()) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> positions(int num, List<Integer> intList) {
		List<Integer> indexes = new ArrayList<>();
		for (int index : intList) {
			indexes.add(index);
		}

		var positions = new ArrayList<Integer>();
		var pairs = zip(indexes, intList);
		for (var pair : pairs) {
			if (pair.getSecond() == num) {
				positions.add(pair.getFirst());
			}
		}
		return positions;
	}

}
