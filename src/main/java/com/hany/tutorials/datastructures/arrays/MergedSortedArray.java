package com.hany.tutorials.datastructures.arrays;

public class MergedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		
		merge(nums1, 3, nums2, 3);
		
		System.out.print("[");
		for(int i:nums1) {
			System.out.print(i +" ");
		}
		System.out.println("]");

	}

	/*
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
	 * one sorted array. Note: The number of elements initialized in nums1 and nums2
	 * are m and n respectively. You may assume that nums1 has enough space (size
	 * that is greater or equal to m + n) to hold additional elements from nums2.
	 * 
	 * Example: Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
	 * 
	 * Output: [1,2,2,3,5,6]
	 * 
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int[] newarray = new int[nums1.length];

		int i = 0, j = 0, k = 0;

		for (; i < m && j < n && k < (m + n); k++) {

			if (nums1[i] < nums2[j]) {
				newarray[k] = nums1[i];
				//System.out.println("i: "+i+" nums1[i]: "+nums1[i]);
				i++;
			} else {
				newarray[k] = nums2[j];
				//System.out.println("j: "+j+" nums2[j]: "+nums2[j]);
				j++;
			}
		}

		for (; i < m; i++, k++) {
			//System.out.println("i: "+i+" nums1[i]: "+nums1[i]);
			newarray[k] = nums1[i];
		}
		for (; j < n; j++, k++) {
			//System.out.println("j: "+j+" nums2[j]: "+nums2[j]);
			newarray[k] = nums2[j];
		}
		
		//for(i=0; i<newarray.length;i++) {
			//nums1[i] = newarray[i];			
		//}

		nums1 = newarray.clone();	
	}

}
