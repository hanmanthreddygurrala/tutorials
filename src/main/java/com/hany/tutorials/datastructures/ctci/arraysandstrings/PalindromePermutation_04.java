package com.hany.tutorials.datastructures.ctci.arraysandstrings;

public class PalindromePermutation_04 {

	/*
	 * CTCI : Chapter1 : Arrays and Strings
	 * 1.4 Palindrom Permutation: Given a string, write a function to check
	 * if it is a permutation of a palindrome. A palindrome is a word or 
	 * phrase that is the same forwards and backwards. A permutation is 
	 * a rearrangement of letters. The palindrome does not need to be 
	 * limited to just dictionary words.
	 * EXAMPLE
	 * Input:	Tact Coa
	 * Output:	True (Permutations: "taco cat", "atco cta", etc.)
	 * */
	
	public static boolean checkPalindromePermutation(String s) {
		s = s.toLowerCase().replace(" ", "");
		
		int[] asciiarray = new int[256];
		
		for(char c: s.toCharArray()) {
			
			if(asciiarray[(int)c] == 0) {
				asciiarray[(int)c]++;
				continue;
			}
			
			asciiarray[(int)c]--;
		}
		
		int uniquecheckcount=0;
		
		for(int i: asciiarray) {
			
			if(i != 0) {
				uniquecheckcount++;
			}
			
			if(uniquecheckcount > 1) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdef";
		
		System.out.println("Palindrome permutation of string '"+s+"' is: "+ checkPalindromePermutation(s));

	}

}
