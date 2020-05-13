package jp.co.aivick.homework2;

public class NumPair<T extends Number, S extends Number> {

		private final T first;
		private final S second;
		
		public NumPair(T first, S second) {
			this.first = first;
			this.second = second;
		}

		public T getFirst() {
			return first;
		}

		public S getSecond() {
			return second;
		}
		
		
}
