import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час, сума пари, дали съм здрав:");

		int hour = sc.nextInt();
		double cash = sc.nextDouble();
		boolean health = sc.nextBoolean();

		boolean healthyKaffe = ((health == true) && (cash < 10) && (cash > 0));
		boolean healthyMovies = ((health == true) && (cash > 10));
		boolean notHealthyTea = ((health == false) && (cash <= 0));
		boolean notHealthyMed = ((health == false) && (cash > 0));

		if (hour < 0 || hour > 24) {
			System.out.println("Невалиден час!!!");

		} else {
			if (healthyKaffe == true) {
				System.out.println("Здрав съм! Ще отида на кафе.");
			} else {
				if (healthyMovies == true) {
					System.out.println("Здрав съм! Ще отида на кино.");
				} else {
					if (notHealthyTea == true) {
						System.out.println("Болен съм! Ще стоя вкъщи и ще пия чай.");
					} else {
						if (notHealthyMed == true) {
							System.out.println("Болен съм! Ще отида да си купя лекарства.");
						} else {
							System.out.println("Здрав съм, но нямам пари, ще си стоя вкъщи.");
						}
					}
				}
			}

		}

	}

}
