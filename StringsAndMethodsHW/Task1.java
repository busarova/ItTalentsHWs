import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете първия низ:");		
		String text = sc.nextLine();
		System.out.println("Въведете втория низ:");
		String text1 = sc.nextLine();

		System.out.println(text.toUpperCase() + " " + text.toLowerCase() + " "
						  + text1.toUpperCase() + " " + text1.toLowerCase());
	}

}
