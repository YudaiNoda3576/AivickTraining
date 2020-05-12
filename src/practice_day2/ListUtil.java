package practice_day2;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	
	public static void main (String[]args) {
//		evensofメソッド
		var intList = List.of(1,2,3,4,5,6);
		
		var evensList = ListUtil.evensof(intList);
		
		for (Integer e : evensList) {
			System.out.println(e);
		}
		
//		replicateメソッド
		var hogeList = ListUtil.replicate(3, "hoge");
		System.out.println(hogeList);
		
//		zipメソッド
		var pair = ListUtil.zip(List.of(1,2,3), List.of(2,3,4));
		System.out.println(pair);

//		factorsメソッド
		var factors = ListUtil.factors(7);
		System.out.println(factors);
	
//		perfectsメソッド
		var perfects = ListUtil.perfects(500);
		System.out.println(perfects);
		
//		pairsメソッド
		var pairs = ListUtil.pairs(List.of(1,2,3,4));
		System.out.println(pairs);
		
	}
	
	
	public static List<Integer> evensof(List<Integer> intList) {
		List<Integer> evensList = new ArrayList<>();
		for(Integer e : intList) {
			if(e % 2 == 0) {
				evensList.add(e);
			}
		}
		return evensList; 
	}
	
	public static List<String> replicate(int arrayLength , String value) {
		List<String>hogeList = new ArrayList<>();
		for(int i = 0; i < arrayLength; i++) {
			hogeList.add(value);
		}
		return hogeList;
	}
	
	public static List<Pair<Integer, Integer>> zip(List<Integer> first, List<Integer> second){
		List<Pair<Integer, Integer>> pair = new ArrayList();
		int min_size = Math.min(first.size(), second.size()); 
		
		for(int i = 0; i < min_size; i++) {
			Pair<Integer, Integer> value  =  new Pair<>(first.get(i), second.get(i));
			pair.add(value);
		}
		return pair; 
	}
	
	public static List<Integer> factors(int num) {
		List<Integer> factors = new ArrayList<>();
		for(int factor = 1; factor <= num; factor++) {
			if(num % factor == 0) {
				factors.add(factor);
			}
		}
		return factors;
	}
	
	public static List<Integer> perfects(int num) {
		List<Integer> perfects = new ArrayList<>();
		for(int i = 1; i < num; i++) {
			int sum = 0;
			List<Integer> factors = ListUtil.factors(i);
			for(int factor : factors) {
				sum += factor;
			}
			if(sum - i== i) {
				perfects.add(i);
			}
		}
		return perfects;
	}
	
//	<T>は型パラメーター　ジェネリクスメソッド
	public static <T> List<Pair<T, T>> pairs(List<T> list) {
		List<Pair<T, T>> pairs = new ArrayList<>();
		for(int i = 0; i < pairs.size(); i++) {
			Pair<T, T> pair = new Pair<>(list.get(i), list.get(i + 1));
			pairs.add(pair);
		}
		return pairs;
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	

