import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����:");

		int vol = sc.nextInt();

		if (vol < 10 || vol > 9999) {
			System.out.println("��������� ����!");
		} else {

			int bucketCount = vol / 5;

			if (vol % 5 == 0) {
				System.out.println(bucketCount + " �� 2 �����.");
				System.out.println(bucketCount + " �� 3 �����.");
			}
			if (vol % 5 == 1) {
				System.out.println(bucketCount - 1 + " �� 2 �����.");
				System.out.println(bucketCount - 1 + " �� 3 �����.");
				System.out.println("������������ 2 ���� �� 3 �����.");
			}
			if (vol % 5 == 2) {
				System.out.println(bucketCount + " �� 2 �����.");
				System.out.println(bucketCount + " �� 3 �����.");
				System.out.println("������������ ���� �� 2 �����.");
			}
			if (vol % 5 == 3) {
				System.out.println(bucketCount + " �� 2 �����.");
				System.out.println(bucketCount + " �� 3 �����.");
				System.out.println("������������ ���� �� 3 �����.");
			}
			if (vol % 5 == 4) {
				System.out.println(bucketCount + " �� 2 �����.");
				System.out.println(bucketCount + " �� 3 �����.");
				System.out.println("������������ 2 ���� �� 2 �����.");
			}

		}

	}

}
