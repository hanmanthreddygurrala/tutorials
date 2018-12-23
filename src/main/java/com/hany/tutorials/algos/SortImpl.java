package com.hany.tutorials.algos;


public class SortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAlgorithm sortAlgorithm = new InsertionSort();
		
		int[] array = new int[] { 6, 3, 1, 2, 4, 5 };
		sortAlgorithm.sort(array);
		print(array);

		int[] array1 = new int[] { 1, 3, 4, 5, 6, 2 };
		sortAlgorithm.sort(array1);
		print(array1);

	}

	public static void print(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
		System.out.println("]");
	}


}
