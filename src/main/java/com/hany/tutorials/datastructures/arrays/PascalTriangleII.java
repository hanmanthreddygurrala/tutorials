package com.hany.tutorials.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;


public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> PascalTriangle = getRow(4);
		
		System.out.print("[");
			
			for(int i: PascalTriangle) {
				System.out.print(i+" ");
			}
			System.out.println("]");
		
	}
	
	/*
	 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
   	   Note that the row index starts from 0.
   	   In Pascal's triangle, each number is the sum of the two numbers directly above it.
	   Example:
	   Input: 3
	   Output: [1,3,3,1]

	   Follow up:
	   Could you optimize your algorithm to use only O(k) extra space?
	 * */
	
	public static List<Integer> getRow(int rowIndex) {
        
		List<Integer> currentRow = new ArrayList<Integer>();
		
		for(int i=0; i <= rowIndex; i++) {
			
			List<Integer> previousrow = currentRow;
			
			currentRow = new ArrayList<Integer>();
			for(int j=0; j<=i; j++) {
				if(j==0||j==i) {
					currentRow.add(1);
					continue;
				}
				
				currentRow.add(previousrow.get(j-1)+previousrow.get(j));								
			}
			
		}
		
		
		
		return currentRow;
    }
	

}
