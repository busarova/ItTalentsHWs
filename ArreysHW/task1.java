import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �� ������:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		int min = 2147483647;
		boolean nonDiv3 = true;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("�������� �������:");
			arr[i] = sc.nextInt();

			if (arr[i] < min && arr[i] % 3 == 0) {
				min = arr[i];
				nonDiv3 = false;
			}
		}
		if (nonDiv3) {
			System.out.println("���� ����� ������ �� 3.");
		} else {
			System.out.println("���-������� ����� ������ �� 3 � " + min + ".");
		}
	}
}
