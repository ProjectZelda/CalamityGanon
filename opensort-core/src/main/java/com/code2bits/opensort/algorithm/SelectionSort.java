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
 * The SelectionSort class implements the Selection algorithm for sorting an array of integers. 
 * 
 * The algorithm divides the input list into two parts. The first sublist is built up from left to right and 
 * contains items that are already sorted. The second sublist contains the items to be sorted. Initially, the
 * sorted sublist is empty and the unsorted sublist is the entire input list.  The algorithm starts by 
 * finding the smallest element in the unsorted sublist, swapping it with the leftmost unsorted element. This
 * places the element in a sorted position, and moving the sublist boundaries one element to the right.
 * 
 * @author	André Maré
 */
public final class SelectionSort implements Sort {
	
	
	/**
	 * The sort method is invoked by external classes to sort an array of integers by making use of the 
	 * SelectionSort algorithm.
	 */
	public void sort(int[] collection) {
		if (collection != null) {
			selectionSort(collection);
		} else {
			throw new IllegalArgumentException("Input paramenter for array to sort is null.");
		}
	}
	
	
	/**
	 * The method implements the selection sorting algorithm which is all about locating the smallest value 
	 * from the unsorted part of the array and places it at the position indicated by the iterator.
	 */
	private void selectionSort(int[] collection) {
		int arrayLength = collection.length;
		
		for (int i=0; i < arrayLength; i++) {
			int minPosition = i;
			
			for (int j=i+1; j<arrayLength; j++) {
				if (collection[j] < collection[minPosition]) {
					minPosition = j;					
				}
			}
			swap(collection, minPosition, i);
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
