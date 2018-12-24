package com.hany.tutorials.datastructures.arraylist;

public class ArrayList {

	private static final int DEFAULTSIZE = 10;
	private int[] array = null;

	public ArrayList() {
		array = new int[DEFAULTSIZE];
	}

	public ArrayList(int size) {
		if (size > 0) {
			array = new int[size];
		}else {
			throw new RuntimeException("Invalid size");
		}
	}
}
