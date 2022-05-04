package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String args[]) {

		// To remove the duplicate words in a string

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (String string : split) {
			set.add(string);
		}
		System.out.println(set);
	}
}
