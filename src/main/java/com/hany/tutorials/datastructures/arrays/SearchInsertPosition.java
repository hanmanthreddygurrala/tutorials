package com.hany.tutorials.datastructures.arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(searchInsertFaster(new int[] { 1, 3, 5, 6 }, 5));
		System.out.println(searchInsertFaster(new int[] { 1, 3, 5, 6 }, 2));
		System.out.println(searchInsertFaster(new int[] { 1, 3, 5, 6 }, 7));
		System.out.println(searchInsertFaster(new int[] { 1, 3, 5, 6 }, 0));

	}

	public static int searchInsert(int[] nums, int target) {

		int i = 0;

		if (nums == null || nums.length == 0) {
			return i;
		}

		for (; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}

		return i;
	}

	public static int searchInsertFaster(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return 0;
		}
		int low = 0;
		int high = nums.length - 1;
		int mid = (low + high) / 2;

		while (low <= high && nums[mid] != target) {

			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

			mid = (low + high) / 2;
		}

		if (nums[mid] == target) {
			return mid;
		}

		if (low > high)
			return low;

		return high;

	}

}
