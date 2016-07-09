import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете две имена разделени със запетая:");
		String names = sc.nextLine();

		String[] namesArr = names.split(",");
		String name1 = namesArr[0].trim();
		String name2 = namesArr[1].trim();
		
		int sumName1 = sumChars(name1);
		int sumName2 = sumChars(name2);

		if (sumName1 == sumName2) {
			System.out.println("Сборовете от ASCII кодовете на съставящите имената букви са равни.");
		} else if (sumName1 > sumName2) {
			System.out.println(name1);
		} else
			System.out.println(name2);

	}

	static int sumChars(String name) {

		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			sum += name.codePointAt(i);
		}
		return sum;
	}
}
