package com.hany.tutorials.datastructures.ctci.arraysandstrings;

public class CheckPermutation_02 {

	/*
	 * CTCI : Chapter1 : Arrays and Strings
	 * 1.2: Check Permutation: Given two strings write a method to decide
	 * if one is a permutation of the other
	 * 
	 * Questions to ask with Interviewer:
	 * 1. are the strings case sensitive
	 * 2. should we consider spaces.
	 * 
	 * */
	public static boolean checkPermutation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] asciiarray = new int[256];
		
		
		
		for(char c: s1.toCharArray()) {
			asciiarray[(int)c]++;
		}
		
		for(char c: s2.toCharArray()) {
			if(asciiarray[(int)c] == 0) {
				return false;
			}
			
			asciiarray[(int)c]--;
			
		}
		
		/*for(int i=0; i<256; i++) {
			if(asciiarray[i] > 0) {
				return false;
			}
		}*/
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc";
		String s2 = "ab";
		
		System.out.println("Is s1: "+s1+" and s2: "+s2+" permutation of each other: "+checkPermutation(s1, s2));
		
		
	}
	
	
	
	

}
