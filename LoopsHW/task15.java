import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число N:");
		int n = sc.nextInt();
		int sum = 0;
		int num = 1;
		
		do {
			
			sum += num;
			num++;
			
		} while (num <= n);
		System.out.println(sum);
	}

}
