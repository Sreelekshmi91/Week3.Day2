package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// To find missing element in an array

		int[] Array = { 1, 2, 3, 4, 6, 7, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i : Array) {
			list.add(i);
		}
		System.out.println("Array input is : " + list);
		int sum = 0;
		for (int i : Array) {
			sum = sum + i;
		}
		int sum1 = 0;
		for (int j = 1; j <= 8; j++) {
			sum1 = sum1 + j;
		}
		int m = sum1 - sum;
		System.out.println("Missing Element in the given Array is " + m);
	}
}

