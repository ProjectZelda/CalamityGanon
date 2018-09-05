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


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.code2bits.opensort.utils.ArrayUtils;


/**
 * The BubbleSortRecursiveTest class forms part of the Test Driven Development approach to test the 
 * BubbleSortRecursiveAlgorithm class.
 * 
 * @author	André Maré
 */
public class BubbleSortRecursiveTest {
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testBubbleSortRecursiveNull() {
		int[] unsortedArray = null;
		new BubbleSortRecursive().sort(unsortedArray);
	} 

	
	@Test
	public void testBubbleSortRecursiveSizeOne() {
		int[] unsortedArray = ArrayUtils.generateArraySize(1);
		assertSortedArray(unsortedArray);
	} 
	
	
	@Test
	public void testBubbleSortRecursiveSizeTen() {
		int[] unsortedArray = ArrayUtils.generateArraySize(10);
		assertSortedArray(unsortedArray);
	} 

	
	@Test
	public void testBubbleSortRecursiveSizeTwenty() {
		int[] unsortedArray = ArrayUtils.generateArraySize(20);
		assertSortedArray(unsortedArray);
	} 
	
	
	@Test
	public void testBubbleSortRecursiveSizeFifty() {
		int[] unsortedArray = ArrayUtils.generateArraySize(50);
		assertSortedArray(unsortedArray);
	} 
	
	
	@Test
	public void testBubbleSortRecursiveSizeHundred() {
		int[] unsortedArray = ArrayUtils.generateArraySize(100);
		assertSortedArray(unsortedArray);
	} 
	
	
	@Test
	public void testBubbleSortRecursiveSizeThousand() {
		int[] unsortedArray = ArrayUtils.generateArraySize(1000);
		assertSortedArray(unsortedArray);
	} 


	private void assertSortedArray(int[] unsortedArray) {			
		new BubbleSortRecursive().sort(unsortedArray);
		assertEquals("Array is Sorted.", true, ArrayUtils.isSorted(unsortedArray));
	} 
	
	
}
