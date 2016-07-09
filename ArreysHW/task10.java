import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		float sum = 0;
		float average = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете елемент:");
			arr[i] = sc.nextInt();

			sum += arr[i];
		}
		average = sum / arr.length;
		float dif = 0;
		float minDif = 2147483647;
		int minDifElement = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (average >= arr[i]) {
				dif = average - arr[i];
			} else {
				dif = arr[i] - average;
			}
			if (dif < minDif) {
				minDif = dif;
				minDifElement = arr[i];
			}
		}
		System.out.println("Средна стойност " + average + " най-близка стойност до средната " + minDifElement + ".");
	}

}
