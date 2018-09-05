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


import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

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
public class SortFactoryTest {
	
	
	@Test
	public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<SortFactory> constructor = SortFactory.class.getDeclaredConstructor();
		assertEquals("Modifier is Private.", true, Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	} 

	
	@Test
	public void testGetSorterDefault() {
		Sort defaultSort = SortFactory.getSorter(-1);
		assertEquals("QuickSortAlgorithm is Instantiated.", true, defaultSort instanceof QuickSort); 
	}
	
	
	@Test
	public void testGetSorterBubbleSort() {
		Sort bubbleSort = SortFactory.getSorter(SortFactory.BUBBLE_SORT);
		assertEquals("BubbleSortAlgorithm is Instantiated.", true, bubbleSort instanceof BubbleSort); 
	}

	
	@Test
	public void testGetSorterBubbleSortRecursive() {
		Sort bubbleSortRecursive = SortFactory.getSorter(SortFactory.BUBBLE_SORT_RECURSIVE);
		assertEquals("BubbleSortRecursiveAlgorithm is Instantiated.", true, bubbleSortRecursive instanceof BubbleSortRecursive); 
	}

	
	@Test
	public void testGetSorterInsertionSort() {
		Sort insertionSort = SortFactory.getSorter(SortFactory.INSERTION_SORT);
		assertEquals("InsertionSortAlgorithm is Instantiated.", true, insertionSort instanceof InsertionSort); 
	}
	
	
	@Test
	public void testGetSorterInsertionSortRecursive() {
		Sort insertionSortRecursive = SortFactory.getSorter(SortFactory.INSERTION_SORT_RECURSIVE);
		assertEquals("InsertionSortRecursiveAlgorithm is Instantiated.", true, insertionSortRecursive instanceof InsertionSortRecursive); 
	}

	
	@Test
	public void testGetSorterQuickSort() {
		Sort quickSort = SortFactory.getSorter(SortFactory.QUICK_SORT);
		assertEquals("QuickSortAlgorithm is Instantiated.", true, quickSort instanceof QuickSort); 
	}
	

	@Test
	public void testGetSorterSelectionSort() {
		Sort selectionSort = SortFactory.getSorter(SortFactory.SELECTION_SORT);
		assertEquals("SelectionSortAlgorithm is Instantiated.", true, selectionSort instanceof SelectionSort); 
	}


}
