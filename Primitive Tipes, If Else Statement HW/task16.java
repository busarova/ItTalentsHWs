import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���������� �����:");
		int num = sc.nextInt();

		if (num < 100 || num > 999) {
			System.out.println("��������� �����!");
		} else {

			int digit3 = num % 10;
			num /= 10;
			int digit2 = num % 10;
			num /= 10;
			int digit1 = num % 10;

			if (digit1 == digit2 && digit2 == digit3) {
				System.out.println("������� �� �����.");
			} else if (digit1 > digit2 && digit2 > digit3) {
				System.out.println("������� �� � �������� ���.");
			} else if (digit1 < digit2 && digit2 < digit3) {
				System.out.println("������� �� ��� �������� ���.");
			} else
				System.out.println("������� �� ����������.");

		}
	}

}
