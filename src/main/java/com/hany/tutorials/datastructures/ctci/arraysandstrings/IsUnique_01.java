package com.hany.tutorials.datastructures.ctci.arraysandstrings;

public class IsUnique_01 {

	
	/*
	 * * CTCI : Chapter1 : Arrays and Strings
	 * 1.1: Is Unique: Implement an algorithm to determine if a string 
	 * has all unique characters. What if you cannot use additional 
	 * data structures
	 * */
	
	public static boolean IsUnique(String value) {
		
		int[] asciiarray = new int[256];
		
		for(char c: value.toCharArray()) {
			if(asciiarray[(int)c] != 0) {
				return false;
			}
			asciiarray[(int)c]++;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "&^()+_!~`*%$#@=;:'abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Is Unique "+value+": "+IsUnique(value));

	}

}
