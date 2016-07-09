import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете сума:");
		int sum = sc.nextInt();
		
		if (sum < 1 || sum > 27) {
			System.out.println("Невалидна сума!");
		} else {
			for (int num = 100; num <= 999; num++) {

				int saveNum = num;

				int digit1 = saveNum % 10;
				saveNum /= 10;
				int digit2 = saveNum % 10;
				saveNum /= 10;
				int digit3 = saveNum % 10;

				if (digit1 + digit2 + digit3 == sum) {
					System.out.println(num);
				}
			}
		}
	}

}
