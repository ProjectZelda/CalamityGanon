/**
 * MIT License
 * 
 * Copyright (c) 2017 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.opensort.algorithm;


import com.code2bits.opensort.Sort;


/**
 * The InsertionSort class implements the InsertionSort algorithm for sorting an array of integers.  
 * 
 * Insertion sort is a sorting algorithm that builds the final sorted array (or list) one item at a time. 
 * The algorithm iterates over the list and removes the current element, finds the location within the 
 * sorted part of the list, and inserts it there.  This process is repeated until the whole list is 
 * sorted.
 * 
 * @author	André Maré
 */
public final class InsertionSort implements Sort {
	
	
	/**
	 * The sort method is invoked by external classes to sort an array of integers by making use of the 
	 * InsertionSort algorithm.
	 */
	public void sort(int[] collection) {
		if (collection != null) {
			insertionSort(collection);
		} else {
			throw new IllegalArgumentException("Input paramenter for array to sort is null.");
		}
	} 
	
	
	/**
	 * Insertion sort is a sorting algorithm that builds the final sorted array (or list) one item at a time. 
	 * The algorithm iterates over the list and removes the current element, finds the location within the 
	 * sorted part of the list, and inserts it there.  This process is repeated until the whole list is 
	 * sorted.
	 */
	private void insertionSort(int[] collection) {
		int arrayLength = collection.length;
		
		for (int i=1; i < arrayLength; ++i) {
			int keyValue = collection[i];
			int iterator = i-1;
	 
			while (iterator>=0 && collection[iterator] > keyValue) {
				collection[iterator+1] = collection[iterator];
				iterator = iterator-1;
			}
			collection[iterator+1] = keyValue;
		}
	}
	
	
}
