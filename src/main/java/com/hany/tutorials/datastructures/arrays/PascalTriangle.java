package com.hany.tutorials.datastructures.arrays;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> PascalTriangle = generate(5);
		System.out.println("[");
		for(List<Integer> lst: PascalTriangle) {
			System.out.print("[");
			
			for(int i: lst) {
				System.out.print(i+" ");
			}
			System.out.println("]");
		}
		
		System.out.println("");
		System.out.println("]");
		

	}

	/*
	 * Given a non-negative integer numRows, generate the first numRows of Pascal's
	 * triangle. In Pascal's triangle, each number is the sum of the two numbers
	 * directly above it.
	 * 
	 * Example: Input: 5 Output: 
	 * [ 
	 * 	   [1], 
	 *    [1,1], 
	 *   [1,2,1], 
	 *  [1,3,3,1], 
	 * [1,4,6,4,1] 
	 * ]
	 */
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> PascalTriangle = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> lstInteger = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					lstInteger.add(1);
					continue;
				}

				lstInteger.add(PascalTriangle.get(i - 1).get(j - 1) + PascalTriangle.get(i - 1).get(j));
			}

			PascalTriangle.add(lstInteger);
		}

		return PascalTriangle;
	}

}
