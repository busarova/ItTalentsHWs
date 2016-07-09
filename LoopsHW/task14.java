import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число N:");
		int n = sc.nextInt();
		
		if (n < 10 || n > 200) {
			System.out.println("Невалиднo число!");
		} else {
			for (int num = n; num >= 10; num--) {
				if (num % 7 == 0){
					System.out.println(num);
				}
			}
		}
	}

}
