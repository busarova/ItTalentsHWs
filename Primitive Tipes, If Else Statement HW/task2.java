import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете две цели числа:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		int dif = num1 - num2;
		int prod = num1 * num2;
		int modul = num1 % num2;
		int del = num1 / num2;

		System.out.println("Сума: " + sum);
		System.out.println("Разлика: " + dif);
		System.out.println("Произведение: " + prod);
		System.out.println("Остатък: " + modul);
		System.out.println("Частно: " + del);

		// ____________________________________________________________________________________________

		System.out.println("Въведете две числа с плаваща запетая:");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();

		double sumD = num3 + num4;
		double difD = num3 - num4;
		double prodD = num3 * num4;
		double modulD = num3 % num4;
		double delD = num3 / num4;

		System.out.println("Сума: " + sumD);
		System.out.println("Разлика: " + difD);
		System.out.println("Произведение: " + prodD);
		System.out.println("Остатък: " + modulD);
		System.out.println("Частно: " + delD);

	}

}
