package com.hany.tutorials.datastructures.ctci.arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeroMatrix_08 {
	/*
	 * CTCI : Chapter1 : Arrays and Strings 
	 * Zero Matrix: Write an algorithm such that if an element in a M*N matrix
	 * is 0, is entire row and column are set to 0;
	*/
	
	public static int[][] zeroMatrix(int[][] array2D){
		
		Map<Integer, Integer> rows = new HashMap<>();
		Map<Integer, Integer> columns = new HashMap<>();
		
		for(int i=0; i<array2D.length;i++) {
			for(int j=0; j<array2D[0].length;j++) {
				
				if(array2D[i][j] == 0) {
					
					rows.put(i, 1);
					columns.put(j, 1);					
				}
				
			}
		}
		
		for(int i=0; i<array2D.length;i++) {
			for(int j=0; j<array2D[0].length;j++) {
				
				if(rows.containsKey(i) || columns.containsKey(j)) {
					array2D[i][j] = 0;
				}				
			}
		}
		
		
		return array2D;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array2D = new int[][] {
			{1,1,0},
			{1,1,1},
			{1,0,1},
			{0,1,1}
		};
		
		System.out.println(Arrays.deepToString(array2D));
		
		zeroMatrix(array2D);
		
		System.out.println(Arrays.deepToString(array2D));

	}

}
