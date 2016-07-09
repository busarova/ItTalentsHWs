import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете изречение:");
		String str = sc.nextLine();

		char[] arr = str.trim().toLowerCase().toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ' ') {
				arr[i + 1] = Character.toUpperCase(arr[i + 1]);
			}
			result.append(arr[i]);
		}

		System.out.println(result);
	}

}
