package com.hany.tutorials.datastructures.arraylist;

public class ArrayList {

	private static final int DEFAULTSIZE = 10;	
	private int[] array = null;
	private int head =0;
	
    public ArrayList(){
    	array = new int[DEFAULTSIZE];
    }
    
    public ArrayList(int size) {
    	array = new int[size];
    }

    public void addElement(int num){
        if(head > array.length){
            throw new RuntimeException("Array is full");
        }
        array[head++]=num;
    }
}
