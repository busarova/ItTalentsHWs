import java.util.Scanner;

public class task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� �� 1 �� 52:");
		int cardNum = sc.nextInt();
		
		for (int card = cardNum; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			
			switch (cardNumber) {
			
			case 1:
				System.out.print("������ ");
				break;
			case 2:
				System.out.print("������ ");
				break;
			case 3:
				System.out.print("�������� ");
				break;
			case 4:
				System.out.print("������ ");
				break;
			case 5:
				System.out.print("������� ");
				break;
			case 6:
				System.out.print("������� ");
				break;
			case 7:
				System.out.print("������ ");
				break;
			case 8:
				System.out.print("������� ");
				break;
			case 9:
				System.out.print("������� ");
				break;
			case 10:
				System.out.print("���� ");
				break;
			case 11:
				System.out.print("���� ");
				break;
			case 12:
				System.out.print("��� ");
				break;
			case 13:
				System.out.print("��� ");
				break;
			}

			switch (cardSuit) {
			case 0:
				System.out.print("����");
				break;
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("����");
				break;
			case 3:
				System.out.print("����");
				break;		
			}
			if(card < 52){
				System.out.print(", ");
			}
		}
	}

}
