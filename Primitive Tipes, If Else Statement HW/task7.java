import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���, ���� ����, ���� ��� �����:");

		int hour = sc.nextInt();
		double cash = sc.nextDouble();
		boolean health = sc.nextBoolean();

		boolean healthyKaffe = ((health == true) && (cash < 10) && (cash > 0));
		boolean healthyMovies = ((health == true) && (cash > 10));
		boolean notHealthyTea = ((health == false) && (cash <= 0));
		boolean notHealthyMed = ((health == false) && (cash > 0));

		if (hour < 0 || hour > 24) {
			System.out.println("��������� ���!!!");

		} else {
			if (healthyKaffe == true) {
				System.out.println("����� ���! �� ����� �� ����.");
			} else {
				if (healthyMovies == true) {
					System.out.println("����� ���! �� ����� �� ����.");
				} else {
					if (notHealthyTea == true) {
						System.out.println("����� ���! �� ���� ����� � �� ��� ���.");
					} else {
						if (notHealthyMed == true) {
							System.out.println("����� ���! �� ����� �� �� ���� ���������.");
						} else {
							System.out.println("����� ���, �� ����� ����, �� �� ���� �����.");
						}
					}
				}
			}

		}

	}

}
