import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първия низ:");
		String word = sc.nextLine();
		System.out.println("Въведете втория низ:");
		String word1 = sc.nextLine();

		int len = word.length() > word1.length() ? word1.length() : word.length();

		if (word.length() == word1.length()) {
			System.out.println("Двата низа са с равна дължина.");
		} else
			System.out.println("Двата низа не са с равна дължина.");

		System.out.println("Разлика по позиции:");
		boolean difPositions = true;
		
		for (int i = 0; i < len; i++) {
			if (word.charAt(i) != word1.charAt(i)) {
				System.out.println((i + 1) + " " + word.charAt(i) + "-" + word1.charAt(i));
				difPositions = false;
			}
		}
		if (difPositions) {
			System.out.println("Няма разлика в равните позиции на двете думи.");
		}
	}

}
