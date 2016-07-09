import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първото число:");
		int a = sc.nextInt();

		System.out.println("Въведете второто число:");
		int b = sc.nextInt();
		int sum = 0;

		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		for (int num = a; num <= b; num++) {
			int sqr = num * num;

			if (sqr % 3 == 0) {
				System.out.print("Skip " + sqr + ", ");
				continue;
			}
			System.out.print(sqr + ", ");
			sum += sqr;
			
			if (sum > 200) {
				break;
			}
		}
	}

}
