import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число:");
		int num = sc.nextInt();
		int saveNum = num;

		if (num < 100 || num > 999) {
			System.out.println("Невалидно число!");
		} else {

			int digit3 = num % 10;
			num /= 10;
			int digit2 = num % 10;
			num /= 10;
			int digit1 = num % 10;

			if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
				System.out.println("На нула не се дели!");
			} else {

				if (saveNum % digit3 > 0) {
					System.out.println("Числото не се дели на последната си цифра.");
				} else
					System.out.println("Числото се дели на последната си цифра.");

				if (saveNum % digit2 > 0) {
					System.out.println("Числото не се дели на втората си цифра.");
				} else
					System.out.println("Числото се дели на втората си цифра.");

				if (saveNum % digit1 > 0) {
					System.out.println("Числото не се дели на първата си цифра.");
				} else
					System.out.println("Числото се дели на първата си цифра.");
			}
		}
	}

}
