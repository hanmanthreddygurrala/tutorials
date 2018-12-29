package com.hany.tutorials.datastructures.ctci.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class OneAway_05 {

	/*
	 * CTCI : Chapter1 : Arrays and Strings 
	 * 1.5 One Away: There are three types of
	 * edits that can be performed on strings: insert a character, remove a
	 * character or replace a character. Given two strings, write a function to
	 * check if they are one edit(or zero edits) away.
	 */

	public static boolean isOneEditAway(String s1, String s2) {

		if (s1 == null || s2 == null || Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		String maxstring = s1.length() > s2.length() ? s1:s2;
		String minstring = maxstring == s1? s2: s1;

		Map<Character, Integer> s1dc = new HashMap<>();

		for (char c : maxstring.toCharArray()) {
			if (!s1dc.containsKey(c)) {
				s1dc.put(c, 1);
				continue;
			}

			s1dc.put(c, s1dc.get(c) + 1);
			
		}
		
		 
		for(char c: minstring.toCharArray()) {
			if (s1dc.containsKey(c)) {
				s1dc.put(c, s1dc.get(c) - 1);
				if(s1dc.get(c) == 0) {
					s1dc.remove(c);
				}
			}			
		}
		
		return s1dc.size() <= 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("is One Edit Away pale, ple  -->"+isOneEditAway("pale", "ple"));
		System.out.println("is One Edit Away pales, pale  -->"+isOneEditAway("pales", "pale"));
		System.out.println("is One Edit Away pale, bale  -->"+isOneEditAway("pale", "bale"));
		System.out.println("is One Edit Away pale, bake  -->"+isOneEditAway("pale", "bake"));
		
		
	}

}
