
public class task23 {

	public static void main(String[] args) {

		int multiplier1 = 1;
		int multiplier2 = 1;

		while (multiplier1 <= 9) {
			while (multiplier2 <= 9) {

				System.out.print(multiplier1 + "*" + multiplier2 + " ");
				multiplier2++;
			}
			System.out.println();
			multiplier1++;
			multiplier2 = multiplier1;
		}
	}

}
