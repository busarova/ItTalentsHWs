import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� A:");		
		int a = sc.nextInt();
		System.out.println("�������� B:");
		int b = sc.nextInt();
		System.out.println("�������� C:");
		int c = sc.nextInt();
		
		if(a<c && c<b){
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		}else 
			System.out.println("������� " + c + " �� � ����� " + a + " � " + b);
		
	}

}
