import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дума:");		
		String text = sc.nextLine();
		String result = "";
		
		for (int i = 0; i < text.length(); i++){
			result += (char)(text.charAt(i) + 5);
		}
		System.out.println(result);
	}

}
