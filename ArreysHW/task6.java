import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �� ������ �����:");

		int length1 = sc.nextInt();
		int[] arr1 = new int[length1];

		System.out.println("�������� ������� �� ������ �����:");

		int length2 = sc.nextInt();
		int[] arr2 = new int[length2];

		if (length1 != length2) {
			System.out.println("�������� �� � �������� ������, ������������ �� ��������.");

		} else {
			for (int i = 0; i < length1; i++) {

				System.out.println("�������� ������� �� ������ �����:");
				arr1[i] = sc.nextInt();
				System.out.println("�������� ������� �� ������ �����:");
				arr2[i] = sc.nextInt();
			}
			boolean equal = true;
			System.out.println("�������� �� � ������� ������.");
			
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("�������� �� ��������.");
					equal = false;
					break;
				}
			}
			if (equal) {
				System.out.println("�������� �� �������.");

			}
		}
	}

}
