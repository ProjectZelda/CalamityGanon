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
package com.code2bits.opensort;


import com.code2bits.opensort.algorithm.BubbleSort;
import com.code2bits.opensort.algorithm.BubbleSortRecursive;
import com.code2bits.opensort.algorithm.InsertionSort;
import com.code2bits.opensort.algorithm.InsertionSortRecursive;
import com.code2bits.opensort.algorithm.QuickSort;
import com.code2bits.opensort.algorithm.SelectionSort;


/**
 * 
 * @author	André Maré
 */
public final class SortFactory {
	
	
	public static final int BUBBLE_SORT = 0;
	public static final int BUBBLE_SORT_RECURSIVE = 1;
	public static final int INSERTION_SORT = 2;
	public static final int INSERTION_SORT_RECURSIVE = 3;
	public static final int QUICK_SORT = 4;
	public static final int SELECTION_SORT = 5;
	
	
	/**
	 * The private constructor suppresses the default constructor to prevent the instantiation of class 
	 * (Ensuring non-instantiability.)
	 */
	private SortFactory() {
	}
	
	
	public static Sort getSorter(int sortAlgorithm) {
		switch(sortAlgorithm) {
			case BUBBLE_SORT: return new BubbleSort();
			case BUBBLE_SORT_RECURSIVE: return new BubbleSortRecursive();
			case INSERTION_SORT: return new InsertionSort();
			case INSERTION_SORT_RECURSIVE: return new InsertionSortRecursive();
			case QUICK_SORT: return new QuickSort();
			case SELECTION_SORT: return new SelectionSort();
			default: return new QuickSort();
		}
	}
	
	
}
