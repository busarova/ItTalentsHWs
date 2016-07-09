import java.util.Scanner;

public class task11a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете височина на триъгълника:");
		int rows = sc.nextInt();

		for (int row = 1; row <= rows; row++) {

			for (int spaces = row; spaces < rows; spaces++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars < row * 2; stars++) {

				if (row == rows || stars == 1 || stars == 2 * row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

