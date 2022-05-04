package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CountOccurance {
	public static void main(String[] args) {
		int count = 0;

		int[] Array = { 1, 2, 3, 1, 4, 5, 1, 6 };

		List<Integer> list = new ArrayList<Integer>();
		for (int i : Array) {
			list.add(i);
		}
		System.out.println("Array input is : " + list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				count++;
			}
		}
		System.out.println("No. Of occurrences of a character '1' " + " is " + count);
	}
}
