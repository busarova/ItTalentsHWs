import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете изречение:");
		String str = sc.nextLine().trim();
		int counter = 0;
		int maxCount = 0;
		int wordCount = 1;

		for (int i = 0; i < str.length(); i++) {
			counter++;
			if (str.charAt(i) == ' ') {
				wordCount++;
				counter = 0;
			}
			if (maxCount < counter) {
				maxCount = counter;
			}
		}
		System.out.print(wordCount + " думи, най-дългата е с " + maxCount + " символа.");
	}

}
