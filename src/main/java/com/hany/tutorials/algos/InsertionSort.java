package com.hany.tutorials.algos;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertionSort implements SortAlgorithm  {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public int[] sort(int[] array) {

		logger.info("insertion sort begins");
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
		
		logger.info("insertion sort ends");

		return array;
	}

}
