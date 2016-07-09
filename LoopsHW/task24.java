import java.util.Scanner;

public class task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число:");
		int num = sc.nextInt();
		int revNum = 0;
		int saveNum = num;

		do {
			int digit = num % 10;
			revNum *= 10;
			revNum += digit;
			num /= 10;
		} while (num > 0);

		if (revNum == saveNum) {
			System.out.println("Числото е палиндром!");
		} else {
			System.out.println("Числото не е палиндром!");
		}
	}

}
