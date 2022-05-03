package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		int[] Array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Set<Integer> Set1 = new HashSet<Integer>();
		for (int i : Array1) {
			Set1.add(i);
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		int m = sum1 - sum;
		System.out.println("Missing Element in the given Array is " + m);
	}
}
