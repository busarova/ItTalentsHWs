import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");
		int n = sc.nextInt();
		int[] arr = new int[10];
		int element1 = 0;
		int element2 = n;
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = element1 + element2;
			element2 = element1;
			element1 = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
