import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете първото число:");		
		int num1 = sc.nextInt();
		
		System.out.println("Въведете второто число:");
		int num2 = sc.nextInt();
		
		if (num1 > num2){
			int num0 = num1;
			num1 = num2;
			num2 = num0;
		}
		for (int i = num1; i <= num2; i++){
			System.out.println(i);
		}

	}

}
