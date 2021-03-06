package jp.co.aivick.homework2;

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
//		表記を指定
	@Override
	public String toString() {
		return "("+ this.first +  "," + this.second + ")";
	}
	
}