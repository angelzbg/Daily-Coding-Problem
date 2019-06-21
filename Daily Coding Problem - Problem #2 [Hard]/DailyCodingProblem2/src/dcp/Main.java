package dcp;

import java.util.Arrays;

public class Main {
	
	/*
	 * Jun 21, 2019, 7:25 PM
	 * Good morning! Here's your coding interview problem for today.
	 * This problem was asked by Uber.
	 * Given an array of integers, return a new array such that each element at index i of the new array
	 * is the product of all the numbers in the original array except the one at i.
	 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
	 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
	 * Follow-up: what if you can't use division?
	 */

	public static void main(String[] args) {
		long[] a1 = {1,2,3,4,5}, a2 = {3,2,1};
		System.out.println(Arrays.toString(a1) + " --> " + Arrays.toString(func(a1)));
		System.out.println(Arrays.toString(a2) + " --> " + Arrays.toString(func(a2)));
		System.out.println(Arrays.toString(a1) + " --> " + Arrays.toString(funcV2(a1)));
		System.out.println(Arrays.toString(a2) + " --> " + Arrays.toString(funcV2(a2)));
	}
	
	private static long[] func(long[] array) {
		if(array == null) return null;
		
		long product = 1;
		for(int i=0; i<array.length; i++) {
			product*=array[i];
		}
		
		long[] out = new long[array.length];
		for(int i=0; i<out.length; i++) {
			out[i] = product/array[i];
		}
		
		return out;
	} // end func()
	
	//Follow-up: what if you can't use division?
	private static long[] funcV2(long[] array) { // definitely not optimal
		if(array == null) return null;
		
		int len = array.length;
		
		long[] out = new long[len];
		
		for(int i=0; i<len; i++) {
			out[i]=1;
			for(int j=0; j<len; j++) {
				if(i!=j) {
					out[i]*=array[j];
				}
			}
		}
		
		return out;
	} // end funcV2()

}