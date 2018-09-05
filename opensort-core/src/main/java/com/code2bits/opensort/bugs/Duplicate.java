package com.code2bits.opensort.bugs;

public class Duplicate {
	/**
	 * The sort method is invoked by external classes to sort an array of integers by making use of the 
	 * BubbleSort algorithm.
	 */
	public void sort(int[] collection) {
		if (collection != null) {
			bubbleSort(collection);
		} else {
			throw new IllegalArgumentException("Input paramenter for array to sort is null.");
		}
	} 
	
	/**
	 * The Bubble Sort algorithm repeatedly steps through the list and compare each adjacent item. The pair 
	 * of values gets swapped if they are in the wrong order.
	 */
	private void bubbleSort(int[] collection) {
        int n = collection.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (collection[j] > collection[j+1]) {
                		swap(collection, j, j+1);
                }
            }
        }
	}
        
        
    	/**
    	 * The method swaps two values around within an array based on the two input parameters x and y.
    	 */
    	private void swap(int[] collection, int x, int y) {
    		int temp = collection[x];
    		collection[x] = collection[y];
    		collection[y] = temp;
    	}
}
