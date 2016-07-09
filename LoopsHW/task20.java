
public class task20 {

	public static void main(String[] args) {

		int numInRow = 0;

		for (int row = 1; row <= 10; row++) {
			numInRow++;
			
			for (int col = 1; col <= 10; col++) {

				if (numInRow > 9) {
					numInRow = 0;
				}
				System.out.print(numInRow);
				numInRow++;			
			}
			System.out.println();
		}
	}

}
