package org.kyel.algorithms;

public class HighestAndLowest {

	public static int searchForHighest(int[] nums) {

		if (nums.length <= 0) {
			return 0;
		}

		int highest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (highest < nums[i]) {
				highest = nums[i];
			}
		}

		return highest;
	}

	public static int searchForLowest() {
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[] k = new int[] { 5, 4, 2, 1, 11, 20 };
		//System.out.println(HighestAndLowest.searchForHighest(k));
		
		int a = 1;
		int b = 2;
		
		
	}
}
