import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на масива:");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		System.out.println("Въведете елементите на масива:");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isMirror = true;

		for (int incI = 0, decI = arr.length - 1; incI < arr.length / 2 && decI > arr.length / 2; incI++, decI--) {
			if (arr[incI] != arr[decI]) {
				System.out.println("МАСИВЪТ НЕ Е ОГЛЕДАЛЕН.");
				isMirror = false;
				break;
			}
		}
		if (isMirror) {
			System.out.println("МАСИВЪТ Е ОГЛЕДАЛЕН.");
		}
	}

}
