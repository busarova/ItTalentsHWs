import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ������� �� �������� �� �������:");
		int length = sc.nextInt();
		System.out.println("�������� ���� �� ���������:");
		char fill = sc.next().charAt(0);

		for (int row = 1; row <= length; row++) {
			for (int col = 1; col <= length; col++) {

				if (row == 1 || col == 1 || row == length || col == length) {
					System.out.print("*");
				} else {
					System.out.print(fill);
				}
			}
			System.out.println();
		}

	}

}
