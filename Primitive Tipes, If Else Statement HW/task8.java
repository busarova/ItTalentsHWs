import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете четирицифрено число:");
		int num = sc.nextInt();
		int newNum1 = 0;
		int newNum2 = 0;

		if (num < 1000 || num > 9999) {
			System.out.println("Невалидно число!");
		} else {

			int digit4 = num % 10;
			num /= 10;
			int digit3 = num % 10;
			num /= 10;
			int digit2 = num % 10;
			num /= 10;
			int digit1 = num % 10;

			newNum1 += digit1;
			newNum1 *= 10;
			newNum1 += digit4;

			newNum2 += digit2;
			newNum2 *= 10;
			newNum2 += digit3;

			if (newNum1 == newNum2) {
				System.out.println(newNum1 + " е равно на " + newNum2);
			} else if (newNum1 > newNum2) {
				System.out.println(newNum1 + " е по-голямо от " + newNum2);
			} else
				System.out.println((newNum1 + " е по-малко от " + newNum2));

		}
	}

}
