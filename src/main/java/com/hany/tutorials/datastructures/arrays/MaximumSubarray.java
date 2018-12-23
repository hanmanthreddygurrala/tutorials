package com.hany.tutorials.datastructures.arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(maxSubArray(new int[] {4,-1,2,1}));

	}
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
	 * which has the largest sum and return its sum.
	   Example:
	   Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6
	   Explanation: [4,-1,2,1] has the largest sum = 6.
	   
	   Follow up:
	   If you have figured out the O(n) solution, 
	   try coding another solution using the divide and conquer approach, 
	   which is more subtle.
	 * */
	
	//Kaden's Alogorithm
	public static int maxSubArray(int[] nums) { 
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int maxSubArray= 0;
		int max = maxSubArray = nums[0];
		
		for(int i=1; i< nums.length; i++) {
			max = Math.max(nums[i], max+nums[i]);
			maxSubArray = Math.max(max, maxSubArray);
		}
		
		return maxSubArray;
    }

}
