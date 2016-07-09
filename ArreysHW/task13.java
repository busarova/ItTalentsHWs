import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");

		int n = sc.nextInt();
		int saveN = n;
		int length = 0;

		while (n > 0) {
			length++;
			n /= 2;
		}
		int[] arr = new int[length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int mod = saveN % 2;
			arr[i] = mod;
			saveN /= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

