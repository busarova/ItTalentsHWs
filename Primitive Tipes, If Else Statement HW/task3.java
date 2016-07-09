import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете две числа:");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num0 = num1;
		num1 = num2;
		num2 = num0;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
