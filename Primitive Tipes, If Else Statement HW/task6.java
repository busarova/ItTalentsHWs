import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете три числа a1, a2, a3:");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		
		int a0;
		
		a0 = a1;
		a1 = a2;
		a2 = a3;
		a3 = a0;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
	}

}
