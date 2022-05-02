package week3.day2;

public class RemoveDuplicates {

	public static void main(String args[]) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j)
						words[i] = "";
				}
			}
		}

		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++) {

			if (words[i] != "") {
				System.out.print(words[i] + " ");
			}
		}
	}
}
