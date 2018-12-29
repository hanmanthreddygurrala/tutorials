package com.hany.tutorials.datastructures.ctci.arraysandstrings;

public class URLify_03 {
	
	/*
	 * CTCI : Chapter1 : Arrays and Strings
	 * 1.3 URLify: Write a method to replace all spaces in a string with
	 * '%20'. You may assume that the string has sufficient space at the end
	 * to hold the additional characters, and that you are given the "true"
	 * length of the string. (Note: If implementing in Java, please use
	 * a character array so that you can perform this operation in place.)
	 * EXAMPLE
	 * Input:  "Mr John Smith    ", 13 - 13 is actual length
	 * Output: "Mr%20John%20Smith"
	 * */
	
	public static String URLify(char[] s, int actualLength) {
		
		 
		int slength = s.length-1;
		for(int i=actualLength-1; i > 0 & i!=slength;i--) {
			 
			if(!Character.isWhitespace(s[i])){
				s[slength] = s[i];
				s[i] = ' ';
				
				slength--;
				continue;
			}
			
			s[slength--] = '0';
			s[slength--] = '2';
			s[slength--] = '%';
			
								
		}
		
		
		//System.out.println(s);
		
		return new String(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sURLify = "Mr John Smith    ";
		 
		System.out.print("URLify of string: "+sURLify+" is: ");
		System.out.println(URLify(sURLify.toCharArray(), 13));
		
	}

}
