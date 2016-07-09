import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете дължина на масива, по-голяма от 3: ");
		int length = sc.nextInt();
		float[] arr = new float[length];
		float absValue = 0;

		System.out.println("Въведете елементите на масива:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		float[] helpArr = new float[3];
		float max = 0;
		int maxIndex = 0;

		for (int index = 0; index < helpArr.length; index++) {
			for (int i = 0; i < arr.length; i++) {
				absValue = arr[i] < 0 ? arr[i] * -1 : arr[i];
				if (max < absValue) {
					max = absValue;
					maxIndex = i;
				}
			}
			helpArr[index] = arr[maxIndex];
			arr[maxIndex] = 0;
			maxIndex = 0;
			max = 0;
		}
		System.out.print(helpArr[0] + "; " + helpArr[1] + "; " + helpArr[2]);
	}

}

