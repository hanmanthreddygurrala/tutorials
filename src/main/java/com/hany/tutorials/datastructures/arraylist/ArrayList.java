package com.hany.tutorials.datastructures.arraylist;

public class ArrayList {

	private static final int DEFAULTSIZE = 10;
	private int[] array = null;

	private int head = 0;

	public ArrayList() {
		array = new int[DEFAULTSIZE];
	}

	public ArrayList(int size) {
		if (size > 0) {
			array = new int[size];
		} else {
			throw new RuntimeException("Invalid size");
		}
	}

	public int getElement(int index) {
		if (index > 0) {
			return array[index];
		} else {
			throw new RuntimeException("Invalid Index");
		}
	}

    public void addElement(int num){
        if(head > array.length){
            throw new RuntimeException("Array is full");
        }
        array[head++]=num;
    }

    public void printElement(int index){

        if(index<0 && index >=array.length){
            throw new RuntimeException("Index out of bound");
        }
        System.out.println(array[index]);
    }

}
