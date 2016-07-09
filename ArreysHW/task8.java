
public class task8 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8 };

		int counter = 1;
		int element = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				counter++;
			} else
				counter = 1;
			
			if (maxCount < counter) {
				maxCount = counter;
				element = arr[i];
			}
		}
		for (int i = 0; i < maxCount; i++) {
			System.out.print(element + " ");
		}
	}

}
