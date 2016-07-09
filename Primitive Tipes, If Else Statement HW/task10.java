import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете обем:");

		int vol = sc.nextInt();

		if (vol < 10 || vol > 9999) {
			System.out.println("Невалиден обем!");
		} else {

			int bucketCount = vol / 5;

			if (vol % 5 == 0) {
				System.out.println(bucketCount + " по 2 литра.");
				System.out.println(bucketCount + " по 3 литра.");
			}
			if (vol % 5 == 1) {
				System.out.println(bucketCount - 1 + " по 2 литра.");
				System.out.println(bucketCount - 1 + " по 3 литра.");
				System.out.println("Допълнително 2 кофи от 3 литра.");
			}
			if (vol % 5 == 2) {
				System.out.println(bucketCount + " по 2 литра.");
				System.out.println(bucketCount + " по 3 литра.");
				System.out.println("Допълнително кофа от 2 литра.");
			}
			if (vol % 5 == 3) {
				System.out.println(bucketCount + " по 2 литра.");
				System.out.println(bucketCount + " по 3 литра.");
				System.out.println("Допълнително кофа от 3 литра.");
			}
			if (vol % 5 == 4) {
				System.out.println(bucketCount + " по 2 литра.");
				System.out.println(bucketCount + " по 3 литра.");
				System.out.println("Допълнително 2 кофи от 2 литра.");
			}

		}

	}

}
