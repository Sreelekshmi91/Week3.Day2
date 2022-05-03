package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {

		// To find the duplicates in the array

		int[] Array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i : Array) {
			list.add(i);
		}
		System.out.println("Array input is : " +list);
		System.out.println("Duplicates in the array is :");

		Set<Integer> Set1 = new HashSet<Integer>();
		for(int i : Array){
			if(!Set1.add(i)){
				System.out.println(i);
			}
		}
	}
}
