package com.hany.tutorials.algos;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 6, 3, 1, 2, 4, 5 };
		sort(array);
		print(array);

		int[] array1 = new int[] { 1, 3, 4, 5, 6, 2 };
		sort(array1);
		print(array1);

	}

	public static void print(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
		System.out.println("]");
	}

	public static int[] sort(int[] array) {

		for (int i = 0; i < array.length-1; i++) {

			int temp;
			if (array[i + 1] < array[i]) {

				temp = array[i + 1];
				array[i + 1] = array[i];
				array[i] = temp;	
				int j = i - 1;
				for (; j >= 0; j--) {

					if (temp < array[j]) {
						array[j + 1] = array[j];
						array[j] = temp;
					}
				}
				
				//print(array);
				if(i == 0)
					array[i] = temp;
				//print(array);
			}

		}

		return array;
	}

}
