import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първата дума:");
		String word1 = sc.nextLine();
		System.out.println("Въведете втората дума:");
		String word2 = sc.nextLine();

		int crossPos = 0;
		int numOfSpaces = 0;
		boolean noSameLetter = true;

		for (int i1 = word2.length() - 1; i1 >= 0; i1--) {
			for (int i2 = word1.length() - 1; i2 >= 0; i2--) {

				if (word2.charAt(i1) == word1.charAt(i2)) {
					noSameLetter = false;
					crossPos = i2;
					numOfSpaces = i1;
				}
			}
		}
		if (noSameLetter) {
			System.out.println("Думите нямат еднакви букви.");
		} else {
			for (int i = 0; i < word1.length(); i++) {

				if (i == crossPos) {
					System.out.println(word2);
				} else {
					for (int spaces = 0; spaces < numOfSpaces; spaces++) {
						System.out.print(" ");
					}
					System.out.println(word1.charAt(i));
				}
			}
		}

	}

}
