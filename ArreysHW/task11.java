import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �� ������:");

		int length = sc.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������� �������:");
			arr[i] = sc.nextInt();
		}
		System.out.println("������ ����� ������ �� 5, �� ��-������ �� 5 ��:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 != 0 || arr[i] <= 5){
				continue;
			}
			System.out.print(arr[i] + " ");
		}
	}
}
