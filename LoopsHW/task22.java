import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число:");
		int n = sc.nextInt();
		int counter = 0;

		if (n < 1 || n > 999) {
			System.out.println("Невалиднo число!");
		} else {

			while (counter < 10) {
				n++;

				if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
					continue;
				}
				counter++;
				System.out.print(counter + ":" + n + " ");
			}
		}
	}
}
