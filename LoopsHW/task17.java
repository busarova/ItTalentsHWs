import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете дължина за страната на квадрат:");
		int length = sc.nextInt();
		System.out.println("Въведете знак за запълване:");
		char fill = sc.next().charAt(0);

		for (int row = 1; row <= length; row++) {
			for (int col = 1; col <= length; col++) {

				if (row == 1 || col == 1 || row == length || col == length) {
					System.out.print("*");
				} else {
					System.out.print(fill);
				}
			}
			System.out.println();
		}

	}

}
