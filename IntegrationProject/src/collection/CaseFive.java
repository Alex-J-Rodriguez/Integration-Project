package collection;

import java.util.Scanner;

public class CaseFive {

	void case5() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 5 \n");

		System.out.println("Type 1 for Celsius to Fahrenheit");
		System.out.println("Type 2 for Fahrenheit to Celsius");
		int choice = scan.nextInt();

		switch (choice) {

		case 1:

			double[] celToFahren = new double[201];
			double fahrenheit = -149.8;

			for (int i = 0; i < 201; i++) {

				celToFahren[i] = fahrenheit + 1.8;
				fahrenheit = fahrenheit + 1.8;
			}

			System.out.println("Enter a degree in Celsius "
			+ "from -100 to 100 that you want"
			+ " converted to Fahrenheit.");
			int degreeC = scan.nextInt();

			while (degreeC < -100 || degreeC > 100) {
				System.out.println("That is not an option");
				System.out.println("Input a degree between -100 and 100");
				degreeC = scan.nextInt();
			}

			int index1 = degreeC + 100;
			System.out.println("Celsius \t Fahrenheit");
			System.out.print(degreeC + " \t\t ");
			System.out.printf("%.1f\n", celToFahren[index1]);
			System.out.println(celToFahren[index1] < 32 ? "Water will"
			+ " freeze at this temperature."
			: "Water will be in a "
			+ "liquid state at this temperature.");
			break;

		case 2:

			double[] fahrenToCel = new double[361];
			double celsius = -100.555556;

			for (int i = 0; i < 361; i++) {

				fahrenToCel[i] = celsius + 0.555556;
				celsius = celsius + 0.555556;
			}

			System.out.println("Enter a degree in Fahrenheit from "
			+ "-148 to 212" + " that you want"
			+ " converted to Celsis.");
			int degreeF = scan.nextInt();

			while (degreeF < -148 || degreeF > 212) {
				System.out.println("That is not an option");
				System.out.println("Input a degree between -148 and 212");
				degreeC = scan.nextInt();
			}

			int index2 = degreeF + 148;
			System.out.println("Fahrenheit \t Celsius");
			System.out.print(degreeF + " \t\t ");
			System.out.printf("%.1f\n", fahrenToCel[index2]);
			System.out.println(fahrenToCel[index2] < 0 ? "Water will "
			+ "freeze at this temperature."
			: "Water will be in "
			+ "a liquid state at this temperature.");
			break;

		}
		scan.close();
	}

}
