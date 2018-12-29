package com.hany.tutorials.datastructures.ctci.arraysandstrings;

public class StringRotation_09 {
	
	/*
	 * CTCI : Chapter1 : Arrays and Strings
	 * 1.9 String Rotation: Assume you have a method isSubString which checks
	 * if one word is a substring of another. Given two strings, s1 and s2, 
	 * write code to check if s2 is a rotation of s1 using only one call to
	 * isSubString(e.g., "waterbotter" is a rotation of "erbottlewat").
	 * */
	public static boolean isStringRotation(String s1, String s2) {
		
		if(s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		
		
		return (s1+s1).contains(s2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println("\""+s1+"\" is a rotation of \""+s2+"\" : "+isStringRotation(s1, s2));
		System.out.println(s1+s1);
	}

}
