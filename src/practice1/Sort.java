package practice1;

import java.util.Arrays;

public class Sort {

	public static  void main(String[] args) {
	  int[]nums = {3, 2, 10, 5, 20, 13};
	  int[]nums2 = {100, 50, 30, 20, 10};
	  
	  Arrays.sort(nums);
	  Arrays.sort(nums2);
	  
	  for(int i : nums) {
		  System.out.println(i);
	  }
	  
	  System.out.println("--------------------------");
	  
	  for(int j : nums2) {
		  System.out.println(j);
	  }
	  
	}

}
