
public class Task7 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 },
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 },
				};
		int maxSum = 0;
		int sumRow = 0;

		for (int index = 0; index < arr.length * arr.length; index++) {

			int row = index / arr.length;
			int col = index % arr.length;

			if ((row + col) % 2 == 0) {
				sumRow += arr[row][col];
				System.out.print(arr[row][col] + " ");
			}
			if (col == arr.length - 1) {
				System.out.println("- сума: " + sumRow);
				maxSum += sumRow;
				sumRow = 0;
			}
		}
		System.out.println("Сума на елементите: " + maxSum);
	}

}
