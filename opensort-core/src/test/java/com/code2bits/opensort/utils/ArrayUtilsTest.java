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
package com.code2bits.opensort.utils;


import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.Test;


public class ArrayUtilsTest {

	@Test
	public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
	  Constructor<ArrayUtils> constructor = ArrayUtils.class.getDeclaredConstructor();
	  assertEquals("Modifier is Private.", true, Modifier.isPrivate(constructor.getModifiers()));
	  constructor.setAccessible(true);
	  constructor.newInstance();
	} // method testConstructorIsPrivate
	
	
	@Test
	public void testWhetherArrayIsSorted() {
		int[] arrayOfIntegers = ArrayUtils.generateArraySize(10);
		Arrays.sort(arrayOfIntegers);
		assertEquals("Array is sorted.", true, ArrayUtils.isSorted(arrayOfIntegers));
	} // method testWhetherArrayIsSorted

	
	@Test
	public void testWhetherArrayIsNotSorted() {
		int[] arrayOfIntegers = ArrayUtils.generateArraySize(10);
		assertEquals("Array is not sorted.", false, ArrayUtils.isSorted(arrayOfIntegers));
	} // method testWhetherArrayIsNotSorted
	
	@Test
	public void testWhetherEmptyArrayIsSorted() {
		int[] arrayOfIntegers = new int[0];
		Arrays.sort(arrayOfIntegers);
		assertEquals("Array is empty.", false, ArrayUtils.isSorted(arrayOfIntegers));
	} // method testWhetherEmptyArrayIsSorted

}
