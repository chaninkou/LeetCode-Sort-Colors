package leetcode75;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0,1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		SortColorByOneTwoThreeFunction solution = new SortColorByOneTwoThreeFunction();
		
		solution.sortColors(nums);
		
		System.out.println("Solution: " + Arrays.toString(nums));
	}
}
