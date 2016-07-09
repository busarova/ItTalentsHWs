
public class Task5 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 },
				};
		int sumRow = 0;
		int sumCol = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;

		for (int row = 0; row < arr.length; row++) {
			sumRow = 0;
			sumCol = 0;
			for (int col = 0; col < arr[0].length; col++) {
				sumRow += arr[row][col];
				sumCol += arr[col][row];
			}
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
			}
		}
		System.out.println("������������ ���� �� ������ � " + maxSumRow);
		System.out.println("������������ ���� �� ������ � " + maxSumCol);
		if (maxSumRow == maxSumCol) {
			System.out.println("������������ ���� �� ������ � ����� �� ������������ ���� �� ������.");
		} else if (maxSumRow > maxSumCol) {
			System.out.println("������������ ���� �� ������ � ��-������ �� ������������ ���� �� ������.");
		} else {
			System.out.println("������������ ���� �� ������ � ��-����� �� ������������ ���� �� ������.");
		}
	}

}
