import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на масива:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете елемент:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Всички числа кратни на 5, но по-големи от 5 са:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 != 0 || arr[i] <= 5){
				continue;
			}
			System.out.print(arr[i] + " ");
		}
	}
}
