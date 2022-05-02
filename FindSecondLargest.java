package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {

		// To find second largest element from the last array

		int[] array = {3,2,11,4,6,7};
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order : "+ Arrays.toString(array));  
		System.out.println("The 2nd element from the last array : " + array[array.length-2]);
	}
}
