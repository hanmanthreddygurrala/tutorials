package com.hany.tutorials.datastructures.arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits = new int[] {1,2,3};
		//digits = plusOne(digits);
		//digits = plusOne(new int[] {4,3,2,1});
		//digits = plusOne(new int[] {4,9,9});
		digits = plusOne(new int[] {9});
		System.out.print("[");
		for(int i:digits) {
			System.out.print(i +" ");
		}
		System.out.println("]");

	}
	
	/*
	 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
	   The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

	   You may assume the integer does not contain any leading zero, except the number 0 itself.
	   Example 1:
	   Input: [1,2,3] 
	   Output: [1,2,4]
	   Explanation: The array represents the integer 123.

	   Example 2:
	   Input: [4,3,2,1]
	   Output: [4,3,2,2]
	   Explanation: The array represents the integer 4321.
	 * */
	
	 public static int[] plusOne(int[] digits) {
		 
		 int carry = 1;
		 int sum =0;
		 
		 for(int i=digits.length-1; i >= 0; i--) {
			 
			 if(carry > 0) {
				 sum = digits[i]+carry;
				 System.out.println("sum : "+sum);
				 carry = sum / 10;
				 System.out.println("sum / 10: "+carry);
				 digits[i] = sum % 10;				 
				 System.out.println("sum % 10: "+digits[i]);
			 }
		 }
		 
		 
		 if(carry > 0) {
			 int[] digitscopy = new int[digits.length+1];
			 digitscopy[0] = carry;
			 for(int i=0; i < digits.length; i++) {
				 digitscopy[i+1] = digits[i];
			 }
			 
			 digits = digitscopy.clone();
		 }
		 
        
		 return digits;
    }

}
