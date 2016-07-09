import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете дума:");		
		String text = sc.nextLine();
		String revWord = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			revWord += text.charAt(i);
		}
		if (text.equals(revWord)) {
			System.out.println("Думата е палиндром.");
		} else {
			System.out.println("Думата не е палиндром.");
		}
		
	}

}
