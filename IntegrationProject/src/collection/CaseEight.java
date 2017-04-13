package collection;

import java.util.Scanner;

public class CaseEight {

	void case8() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 8 \n");

		System.out.println("Enter the total cost of the meal.");
		double totalCost = scan.nextDouble();
		System.out.println("Enter the amount the customer paid.");
		double paid = scan.nextDouble();
		System.out.println("Enter the amount they paid after for whatever reason.");
		double paidExtra = scan.nextDouble();
		double change;
		double finalChange;

		change = paid - totalCost;
		paid = paid + paidExtra;
		finalChange = paid - totalCost;
		System.out.printf("The change is $ %.2f\n", change);
		System.out.printf("The final change is $ %.2f", finalChange);

		scan.close();
	}

}
