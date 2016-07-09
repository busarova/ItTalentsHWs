import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първата дума:");
		String word = sc.nextLine();
		System.out.println("Въведете втората дума:");
		String word1 = sc.nextLine();

		if (word.length() < word1.length()) {
			System.out.println(word1.length() + " " + word.substring(0, 5) + word1.substring(5));
		} else {
			System.out.println(word.length() + " " + word1.substring(0, 5) + word.substring(5));
		}
	}

}
