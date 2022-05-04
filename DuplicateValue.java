package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue {
	public static void main(String[] args) {

		// To find the duplicate value

		String[] Array = { "A", "B", "C", "D", "E", "A", "G", "F", "C" };
		List<String> list = new ArrayList<String>();
		for (String i : Array) {
			list.add(i);
		}
		System.out.println("Input : " + list);
		System.out.println("Duplicate value :");

		Set<String> Set1 = new HashSet<String>();
		for (String i : Array) {
			if (!Set1.add(i)) {
				System.out.println(i);
			}
		}
	}
}