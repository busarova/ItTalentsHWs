import java.util.Scanner;

public class task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число:");
		int num = sc.nextInt();

		if (num < 10 || num > 99) {
			System.out.println("Невалиднo число!");
		} else {
			while (num > 1) {

				if (num % 2 == 0) {
					num *= 0.5;
				} else {
					num = (num * 3) + 1;
				}
				System.out.print(num + " ");
			}
		}
	}

}
