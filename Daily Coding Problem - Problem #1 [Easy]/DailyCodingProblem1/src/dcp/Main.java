package dcp;

public class Main {
	
	/*
	 * Jun 20, 2019, 7:24 PM
	 * Good morning! Here's your coding interview problem for today.
	 * This problem was recently asked by Google.
	 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
	 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
	 */

	public static void main(String[] args) {
		
		int[] list = {10,15,3,7}; // doesn't matter if I'm going to use something implementing List or not, hence I use simple iteration
		int k = 17;
		
		if(canAddUp(list, k)) {
			System.out.println("Two numbers from the list add up to k(" + k + ").");
		} else {
			System.out.println("There aren't wwo numbers from the list to add up to k(" + k + ").");
		}
		
	} // end of main()
	
	private static boolean canAddUp(int[] array, int k) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j] == k) {
					System.out.println(array[i] + " + " + array[j] + " = " + k);
					return true;
				}
			}
		}
		
		return false;
	} // end of canAddUp()

} // end of Main{}