import java.util.Scanner;

public class task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ����o N:");
		int n = sc.nextInt();
		int factoriel = 1;
		int num = 1;

		do {
			factoriel *= num;
			num++;
		} while (num <= n);

		System.out.println(n + "! = " + factoriel);

	}

}
