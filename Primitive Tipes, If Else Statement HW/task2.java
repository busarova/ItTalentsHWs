import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ��� ���� �����:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		int dif = num1 - num2;
		int prod = num1 * num2;
		int modul = num1 % num2;
		int del = num1 / num2;

		System.out.println("����: " + sum);
		System.out.println("�������: " + dif);
		System.out.println("������������: " + prod);
		System.out.println("�������: " + modul);
		System.out.println("������: " + del);

		// ____________________________________________________________________________________________

		System.out.println("�������� ��� ����� � ������� �������:");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();

		double sumD = num3 + num4;
		double difD = num3 - num4;
		double prodD = num3 * num4;
		double modulD = num3 % num4;
		double delD = num3 / num4;

		System.out.println("����: " + sumD);
		System.out.println("�������: " + difD);
		System.out.println("������������: " + prodD);
		System.out.println("�������: " + modulD);
		System.out.println("������: " + delD);

	}

}
