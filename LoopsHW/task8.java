import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число N:");
		int n = sc.nextInt();
		int num = n - 1;

		for (int row = 1; row <= n; row++) {			
			for (int col = 1; col <= n; col++) {
				System.out.print(num);
			}
			System.out.println();
			num += 2;
		}
	}

}
