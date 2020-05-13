package jp.co.aivick.homwork2;

import java.util.ArrayList;
import java.util.List;

public class Pair<T, S> {
	private final T first;
	private final S second;
	
	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public S getSecond() {
		return second;
	}
	
	public static void main (String[]args) {
		Pair<Integer, Integer>pair = new Pair<>(1,2);
	
		System.out.println(pair.getFirst() + "," + pair.getSecond());
		System.out.println(pair.toString());
	}
	
}
