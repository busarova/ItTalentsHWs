import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �� ������:");

		int length = sc.nextInt();
		int[] arr = new int[length];
		int[] newArr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������� �������:");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];

			if (i > 0 && i < arr.length - 1) {
				newArr[i] = arr[i + 1] + arr[i - 1];
			}
			System.out.print(newArr[i] + " ");

		}
	}

}
