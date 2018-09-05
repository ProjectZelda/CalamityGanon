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


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.code2bits.opensort.utils.ArrayUtils;


/**
 * The QuickSortTest class forms part of the Test Driven Development approach to test the 
 * QuickSortAlgorithm class.
 * 
 * @author	André Maré
 */
public class QuickSortTest {
	
	
	private int[] arrayOfInts = null;
	
	@Before
	public void initialise() {
		arrayOfInts = ArrayUtils.generateArraySize(100);		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testQuickSortNull() {
		int[] unsortedArray = null;
		new QuickSort().sort(unsortedArray);
	} 

	
	
	
	@Test
	public void testQuickSortSizeHundred() {
		new QuickSort().sort(arrayOfInts);
		
		assertThat(ArrayUtils.isSorted(arrayOfInts), equalTo(true));

	} 
	
}
