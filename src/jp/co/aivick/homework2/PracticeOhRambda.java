package jp.co.aivick.homework2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.sun.jdi.Value;

public class PracticeOhRambda {
	public static void main (String [] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 5);
		list.stream().forEach(System.out::println);
		
		System.out.println("----map---");
		list.stream().map(x -> x * 2)
					 .forEach(System.out::println);
		
		System.out.println("----filter---");
		list.stream().filter(x -> x % 2 == 0)
					 .forEach(System.out::println);
		
		System.out.println("----sorted---");
		list.stream().sorted(Comparator.reverseOrder())
					 .forEach(System.out::println);
		
		System.out.println("----distinct---");
		list.stream().distinct()
					 .forEach(System.out::println);
		
		System.out.println("----limit---");
		list.stream().limit(3)
					 .forEach(System.out::println);
		
		System.out.println("----Optional---");
		String string = null;
		Optional<String>opt = Optional.ofNullable(string);
		opt.ifPresent(System.out::println);
		string = opt.orElse("abc");
		System.out.println(string);
	}
	
	
	
}
