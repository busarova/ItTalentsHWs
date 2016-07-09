import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете A:");		
		int a = sc.nextInt();
		System.out.println("Въведете B:");
		int b = sc.nextInt();
		System.out.println("Въведете C:");
		int c = sc.nextInt();
		
		if(a<c && c<b){
			System.out.println("Числото " + c + " е между " + a + " и " + b);
		}else 
			System.out.println("Числото " + c + " не е между " + a + " и " + b);
		
	}

}
