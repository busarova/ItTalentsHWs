import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���������� �����:");
		int num = sc.nextInt();
		int saveNum = num;

		if (num < 100 || num > 999) {
			System.out.println("��������� �����!");
		} else {

			int digit3 = num % 10;
			num /= 10;
			int digit2 = num % 10;
			num /= 10;
			int digit1 = num % 10;

			if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
				System.out.println("�� ���� �� �� ����!");
			} else {

				if (saveNum % digit3 > 0) {
					System.out.println("������� �� �� ���� �� ���������� �� �����.");
				} else
					System.out.println("������� �� ���� �� ���������� �� �����.");

				if (saveNum % digit2 > 0) {
					System.out.println("������� �� �� ���� �� ������� �� �����.");
				} else
					System.out.println("������� �� ���� �� ������� �� �����.");

				if (saveNum % digit1 > 0) {
					System.out.println("������� �� �� ���� �� ������� �� �����.");
				} else
					System.out.println("������� �� ���� �� ������� �� �����.");
			}
		}
	}

}
