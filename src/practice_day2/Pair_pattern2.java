package practice_day2;

import java.util.Objects;

public class Pair_pattern2<S, T> {
	private final S first;
	private final T second;
	
	public Pair_pattern2(S first, T second) {
		this.first = first;
		this.second = second;
	}
	
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
		Pair_pattern2<?, ?> pair = (Pair_pattern2<?, ?>) o;			
		return Objects.equals(first, second) &&
		Objects.equals(second, pair.second);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}

}
