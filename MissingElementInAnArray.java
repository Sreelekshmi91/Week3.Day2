package week3.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
                // To find missing element in an array 
		
		int[] array = { 1, 2, 3, 4, 6, 7, 8 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		int sum1 = 0;
		for (int j = 1; j <= 8; j++) {
			sum1 = sum1 + j;
		}
		int m = sum1 - sum;

		System.out.println("Missing Element in an Array is " + m);

	}

}
