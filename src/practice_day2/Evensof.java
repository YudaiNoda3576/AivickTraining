package practice_day2;

import java.util.ArrayList;
import java.util.List;

public class Evensof {
	
	public static void main (String[]args) {
		var intList = List.of(1,2,3,4,5,6);
		
		var evensList = Evensof.evensof(intList);
		
		for (Integer e : evensList) {
			System.out.println(e);
		}
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
}
