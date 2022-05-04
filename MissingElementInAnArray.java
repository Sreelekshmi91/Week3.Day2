package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// To find missing element in an array

		int[] Array = { 1, 2, 3, 4, 7, 6, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i : Array) {
			list.add(i);
		}
		System.out.println("Array input is : " + list);
		Collections.sort(list);
		System.out.println("Sorted input array is : " + list);

		int i = 1;
		for (Integer integer : list) {
			if (integer != i) {
				System.out.println("Missing Element in the given Array is : " + i);
				break;
			}

			i++;
		}
	}
}
