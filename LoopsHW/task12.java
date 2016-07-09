
public class task12 {

	public static void main(String[] args) {
		
		for (int num = 100; num <= 999; num++){
			
			int saveNum = num;
			
			int digit1 = saveNum % 10;
			saveNum /= 10;
			int digit2 = saveNum % 10;
			saveNum /= 10;
			int digit3 = saveNum % 10;
			
			if (digit1 == digit2 || digit2 == digit3 || digit3 == digit1){			
				continue;
			}
			System.out.println(num);		
		}

	}

}
