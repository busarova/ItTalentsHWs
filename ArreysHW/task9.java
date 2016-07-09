import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на масива:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете елемент:");
			arr[i] = sc.nextInt();
		}
		int helpIndex = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			helpIndex = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = helpIndex;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
