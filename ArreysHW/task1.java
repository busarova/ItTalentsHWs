import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на масива:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		int min = 2147483647;
		boolean nonDiv3 = true;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Въведете елемент:");
			arr[i] = sc.nextInt();

			if (arr[i] < min && arr[i] % 3 == 0) {
				min = arr[i];
				nonDiv3 = false;
			}
		}
		if (nonDiv3) {
			System.out.println("Няма числа кратни на 3.");
		} else {
			System.out.println("Най-малкото число кратно на 3 е " + min + ".");
		}
	}
}
