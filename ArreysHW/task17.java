import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �� ������ ��-������ �� 2:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		System.out.println("�������� ���������� �� ������:");
		for (int i = 0; i < arr.length; i++) {			
			arr[i] = sc.nextInt();
		}
		boolean zigZagUp = true;

		if (arr[0] >= arr[1]) {
			System.out.println("�������� �� � �������������� ������");
		} else {
			for (int i = 1; i < arr.length - 1; i++) {

				boolean greater = arr[i] > arr[i + 1] && arr[i] > arr[i - 1];
				boolean lesser = arr[i] < arr[i + 1] && arr[i] < arr[i - 1];
				if (!greater && !lesser) {
					zigZagUp = false;
					break;
				}
			}
			if (zigZagUp) {
				System.out.println("�������� � �������������� ������");
			} else {
				System.out.println("�������� �� � �������������� ������");
			}
		}
	}

}
