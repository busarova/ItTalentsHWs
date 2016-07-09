import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length / 2; i++) {
			newArr[i] = arr[i];
		}
		int helpIndex = newArr.length / 2;
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {

			newArr[helpIndex] = arr[i];
			helpIndex++;
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}
