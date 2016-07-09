
public class task14 {

	public static void main(String[] args) {

		double[] arr = { 7.1, 8.5, 0.2, -1, 3.7, 0.99, 1.4, -3.5, -2.99, -110, 212, 341, 1.2 };

		int length = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				length++;
			}
		}
		double[] newArr = new double[length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArr[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "; ");
		}
	}

}
