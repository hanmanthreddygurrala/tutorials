package com.hany.tutorials.datastructures.arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = twoSum(null, 17);

		if (result != null) {
			for (int data : result) {
				System.out.println(data);
			}
		}else {
			System.out.println("No data");
		}

	}

	/*
	 * Leet Code Question: Given an array of integers, return indices of the two
	 * numbers such that they add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
	 * 2 + 7 = 9,return [0, 1].
	 */

	public static int[] twoSum(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return null;
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int checkval = target - nums[i];

			if (map.containsKey(checkval)) {
				return new int[] { map.get(checkval), i };
			}

			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);

			}

		}

		return null;

	}

}
