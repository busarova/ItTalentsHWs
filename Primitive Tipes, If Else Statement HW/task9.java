import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ��� ���������� �����:");

		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
			System.out.println("��������� �����!");
		} else {

			int prod = a * b;

			int lastDigit = prod % 10;

			if (lastDigit % 2 == 0) {
				System.out.println(prod + ", " + lastDigit + " �����.");
			} else {
				System.out.println(prod + ", " + lastDigit + " �������.");
			}
		}

	}

}
