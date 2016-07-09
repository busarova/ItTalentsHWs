import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете височина на триъгълника:");
		int rows = sc.nextInt();
		int stars = 1;

		for (int row = 1; row <= rows; row++) {

			for (int spaces = 1; spaces <= rows - row; spaces++) {

				System.out.print(" ");
			}
			for (int x = 1; x <= stars; x++) {

				System.out.print("*");
			}
			System.out.println();
			stars += 2;

		}

	}

}
