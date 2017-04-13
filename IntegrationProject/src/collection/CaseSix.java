package collection;

import java.util.Scanner;

public class CaseSix {

	void case6() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 6 \n");

		double[] chickSanPrice = { 4.29, 3.05, 1.29, 4.69, 4.09 };
		String[] chickSanName = { "Culver's", "Chick-fil-A", 
				"McDonald's", "Wendy's", "Burger King" };
		double totalPrice = 0;

		System.out.println("1: First; unnecessarily complicated"
				+ ", attempt at trying to code solution.");
		System.out.println("2: Second attempt");
		int choice = scan.nextInt();

		while (choice < 1 || choice > 2) {
			System.out.println("That is not an option");
			System.out.println("Choose a number 1-2");
			choice = scan.nextInt();
		}

		switch (choice) {

		case 1:

			int[] index = new int[5];
			double cheapestSanPrice = chickSanPrice[0];
			int largest = 0;

			for (int i = 0; i < chickSanPrice.length; i++) {
				boolean tf = cheapestSanPrice < chickSanPrice[i];

				if (tf == true) {
				} else {
					cheapestSanPrice = chickSanPrice[i];
					int indexNum = i;
					index[i] = indexNum;
				}

				if (i == 4) {
					System.out.println("The cheapestSanPriceest Chicken"
							+ " Sandwich is $" + cheapestSanPrice + ".");
				}
			}

			for (int z = 0; z < index.length; z++) {
				if (index[z] > index[largest])
					largest = z;

			}

			System.out.println("The cheapestSanPriceest Chicken Sandwich "
					+ "price was found at index " + largest + ".");
			System.out.println("It can be purchased at " + chickSanName[largest] + ".");

			for (int i = 0; i < chickSanPrice.length; i++) {
				totalPrice = totalPrice + chickSanPrice[i];

			}
			System.out.println("If all of the sandwiches are "
					+ "purchased the total would be $" + totalPrice);
			break;

		case 2:

			int cheapestSanPriceest = 0;
			for (int i = 0; i < chickSanPrice.length; i++) {
				if (chickSanPrice[i] < chickSanPrice[cheapestSanPriceest]) {
					cheapestSanPriceest = i;
				}
			}

			for (int i = 0; i < chickSanPrice.length; i++) {
				totalPrice = totalPrice + chickSanPrice[i];
			}
			System.out.println("The cheapestSanPriceest chicken Sandwich"
					+ " is $" + chickSanPrice[cheapestSanPriceest]
					+ " and it was found at index " + cheapestSanPriceest + ".");
			System.out.println("If all of the sandwiches are "
					+ "purchased the total would be $" + totalPrice);

			break;

		default:
			System.out.println("Choose case 1 or 2");
			break;

		}
		scan.close();
	}
}
