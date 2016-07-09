
public class Task3 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 1, 4, 6, 3 },
				{ 5, 9, 7, 2 },
				{ 4, 8, 1, 9 },
				{ 2, 3, 4, 5 },
				};
		int sum = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				sum += arr[row][col];
			}
		}
		System.out.println("Сума: " + sum);
		System.out.println("Средно аритметично: " + ((float) sum / (arr.length * arr[0].length)));
	}

}
