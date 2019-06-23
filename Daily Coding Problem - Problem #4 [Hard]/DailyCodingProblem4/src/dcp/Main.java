package dcp;

import java.util.HashMap;

public class Main {
	/*
	 * Good morning! Here's your coding interview problem for today.
	 * This problem was asked by Stripe.
	 * Given an array of integers, find the first missing positive integer in linear time and constant space.
	 * In other words, find the lowest positive integer that does not exist in the array.
	 * The array can contain duplicates and negative numbers as well.
	 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
	 * You can modify the input array in-place.
	 */
	public static void main(String[] args) {
		int[] a1 = {3,4,-1,1}, a2 = {1,2,0};
		
		findMissingInteger(a1);
		findMissingInteger(a2);
	} // end of main()
	
	private static void findMissingInteger(int[] array) {
		int min_value = Integer.MAX_VALUE, max_value = Integer.MIN_VALUE;
		boolean b = false;
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i : array) {
			if(i>0) {
				map.put(i, b);
				if(min_value > i) min_value = i;
				if(max_value < i) max_value = i;
			}
		}
		// !!! I am not sure if I have to check if min_value is higher than 1 so I'm just gonna comment it:
		/*if(min_value > 1) {
			System.out.println("First missing integer in the array = " + (min_value-1)));
			return;
		}*/
		for(int i=min_value; i<max_value; i++) {
			if(!map.containsKey(i)) {
				System.out.println("First missing integer in the array = " + i);
				return;
			}
		}
		
		System.out.println("First missing integer in the array = " + (max_value+1));
	} // end of findMissingInteger()
	
} // end of Main{}