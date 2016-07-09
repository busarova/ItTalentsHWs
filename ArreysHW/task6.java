import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на първия масив:");

		int length1 = sc.nextInt();
		int[] arr1 = new int[length1];

		System.out.println("Въведете дължина на втория масив:");

		int length2 = sc.nextInt();
		int[] arr2 = new int[length2];

		if (length1 != length2) {
			System.out.println("Масивите са с различен размер, следователно са различни.");

		} else {
			for (int i = 0; i < length1; i++) {

				System.out.println("Въведете елемент от ПЪРВИЯ масив:");
				arr1[i] = sc.nextInt();
				System.out.println("Въведете елемент от ВТОРИЯ масив:");
				arr2[i] = sc.nextInt();
			}
			boolean equal = true;
			System.out.println("Масивите са с еднакъв размер.");
			
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Масивите са различни.");
					equal = false;
					break;
				}
			}
			if (equal) {
				System.out.println("Масивите са еднакви.");

			}
		}
	}

}
