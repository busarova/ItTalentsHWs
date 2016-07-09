import java.util.Scanner;

public class task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от 1 до 52:");
		int cardNum = sc.nextInt();
		
		for (int card = cardNum; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			
			switch (cardNumber) {
			
			case 1:
				System.out.print("Двойка ");
				break;
			case 2:
				System.out.print("Тройка ");
				break;
			case 3:
				System.out.print("Четворка ");
				break;
			case 4:
				System.out.print("Петица ");
				break;
			case 5:
				System.out.print("Шестица ");
				break;
			case 6:
				System.out.print("Седмица ");
				break;
			case 7:
				System.out.print("Осмица ");
				break;
			case 8:
				System.out.print("Девятка ");
				break;
			case 9:
				System.out.print("Десятка ");
				break;
			case 10:
				System.out.print("Вале ");
				break;
			case 11:
				System.out.print("Дама ");
				break;
			case 12:
				System.out.print("Поп ");
				break;
			case 13:
				System.out.print("Асо ");
				break;
			}

			switch (cardSuit) {
			case 0:
				System.out.print("Пика");
				break;
			case 1:
				System.out.print("Спатия");
				break;
			case 2:
				System.out.print("Каро");
				break;
			case 3:
				System.out.print("Купа");
				break;		
			}
			if(card < 52){
				System.out.print(", ");
			}
		}
	}

}
