import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ������ ���:");
		String word = sc.nextLine();
		System.out.println("�������� ������ ���:");
		String word1 = sc.nextLine();

		int len = word.length() > word1.length() ? word1.length() : word.length();

		if (word.length() == word1.length()) {
			System.out.println("����� ���� �� � ����� �������.");
		} else
			System.out.println("����� ���� �� �� � ����� �������.");

		System.out.println("������� �� �������:");
		boolean difPositions = true;
		
		for (int i = 0; i < len; i++) {
			if (word.charAt(i) != word1.charAt(i)) {
				System.out.println((i + 1) + " " + word.charAt(i) + "-" + word1.charAt(i));
				difPositions = false;
			}
		}
		if (difPositions) {
			System.out.println("���� ������� � ������� ������� �� ����� ����.");
		}
	}

}
