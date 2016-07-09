import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първото число N:");
		int n = sc.nextInt();

		System.out.println("Въведете второто число M:");
		int m = sc.nextInt();

		if (n < 10 || n > 5555 || m < 10 || m > 5555) {
			System.out.println("Невалиднo число!");
		} else {
			if (n > m) {
				int num = n;
				n = m;
				m = num;
			}
			for (int i = m; i >= n; i--) {
				if (i % 50 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
