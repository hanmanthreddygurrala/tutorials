package com.hany.tutorials.algos;

public class InsertionSort implements SortAlgorithm  {

	
	public int[] sort(int[] array) {

		for (int i = 0; i < array.length-1; i++) {

			int temp;
			if (array[i + 1] < array[i]) {

				temp = array[i + 1];
				array[i + 1] = array[i];
				array[i] = temp;	
				int j = i - 1;
				for (; j >= 0; j--) {

					if (temp < array[j]) {
						array[j + 1] = array[j];
						array[j] = temp;
					}
				}
				
				//print(array);
				if(i == 0)
					array[i] = temp;
				//print(array);
			}

		}

		return array;
	}

}
