import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете три различни числа:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		int num0;

		if (num2 < num1){
		     num0 = num2;
		     num2 = num1;
		     num1 = num0;
		}
		if (num3 < num2){
		     num0 = num3;
		     num3 = num2;
		     num2 = num0;
		}
		if (num2 < num1){
		     num0 = num2;
		     num2 = num1;
		     num1 = num0;
		}
		  System.out.println(num3);
		  System.out.println(num2);
		  System.out.println(num1);		 
	}

}
