import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първото число:");
		int x = sc.nextInt();

		System.out.println("Въведете второто число:");
		int y = sc.nextInt();

		if (x < 1 || x > 9 || y < 1 || y > 9) {
			System.out.println("Невалиднo число!");
			
		} else {
			for (int multiplier1 = 1; multiplier1 <= x; multiplier1++) {
				for (int multiplier2 = 1; multiplier2 <= y; multiplier2++) {
					System.out.println(multiplier1 + "*" + multiplier2 + " = " + multiplier1*multiplier2);
				}
			}
		}

	}

}


