
public class zvezdichki {

	public static void main(String[] args) {
		int stars = 5;
		int rows = stars + 1;

		for (int row = 1; row < rows; row++) {
			for (int col = 1; col < rows * 3; col++) {

				if (col == row || col + row == rows 
					|| col + row == rows * 3|| (col == row + rows * 2 && row < rows / 2)
					|| col == rows * 3 / 2
					|| (row == rows / 2 && col > rows && col < rows * 2)) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
