import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �����:");
		int num = sc.nextInt();
		boolean prime = true;
		
		for (int i = 2; i < num; i++){
			if (num % i == 0) {
				prime = false;
				System.out.println("������� " + num + " �� � ������.");
				break;
			}
		}
		if (prime){
			System.out.println("������� " + num + " � ������.");
			
		}
	}

}
