package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String args[]) {

		// To find the intersection of two arrays
		
		int Array1[] = { 3, 2, 11, 4, 6, 7 };
		int Array2[] = { 1, 2, 8, 4, 9, 7 };

		System.out.println("Intersection of the two arrays :");

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i : Array1) {
			set1.add(i);
		}
		for (int j : Array2) {
			set2.add(j);
		}
		for (Integer integer : set1) {
			if (set2.contains(integer)) {
				System.out.println(integer);
			}
		}
	}
}

