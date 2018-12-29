package com.hany.tutorials.datastructures.ctci.arraysandstrings;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.core.util.KeyValuePair;

public class StringCompression_06 {

	/*
	 * CTCI : Chapter1 : Arrays and Strings 
	 * 1.6 String Compression: Implement a
	 * method to perform basic string compression using the counts of repeated
	 * characters. For example, the string aabcccccaaa would become a2b1c5a3. if the
	 * "compressed" string would not become smaller than the original string, your
	 * method should return the original string. You can assume the string has only
	 * uppercase and lowercase letters (a-z)
	 */

	public static String compression(String s) {

		char chk = ' ';
		int count = 0;

		StringBuilder modifiedstring = new StringBuilder();

		for (char c : s.toCharArray()) {

			if (c != chk) {

				if (chk != ' ') {

					modifiedstring.append(chk);
					modifiedstring.append(count);
				}

				chk = c;
				count = 1;
				continue;
			}
			count++;
		}

		if (count > 0) {
			modifiedstring.append(chk);
			modifiedstring.append(count);
		}

		return modifiedstring.length() < s.length() ? modifiedstring.toString() : s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabcccccaaa";
		System.out.println("String Compression of '" + s + "' is: " + compression(s));
		
		s = "abcdef";
		System.out.println("String Compression of '" + s + "' is: " + compression(s));
		
		s = "aabbb";
		System.out.println("String Compression of '" + s + "' is: " + compression(s));
		

	}

}
