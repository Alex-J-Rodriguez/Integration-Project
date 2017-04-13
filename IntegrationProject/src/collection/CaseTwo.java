package collection;

import java.util.Scanner;

public class CaseTwo {

	void case2() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 2 \n");

		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Division");
		System.out.println("4: Multiplication");
		System.out.println("Choose your choice of operation.");
		int choice = scan.nextInt();

		while (choice < 1 || choice > 4) {
			System.out.println("That is not an option");
			System.out.println("Choose a number 1-4");
			choice = scan.nextInt();
		}

		switch (choice) {

		case 1:
			System.out.println("Input an integer");
			int add1 = scan.nextInt();
			System.out.println("Input another integer");
			int add2 = scan.nextInt();
			int addition = add1 + add2;
			System.out.println(addition);
			break;

		case 2:
			System.out.println("Input an integer");
			int minus1 = scan.nextInt();
			System.out.println("Input another integer");
			int minus2 = scan.nextInt();
			int subtraction = minus1 - minus2;
			System.out.println(subtraction);
			break;

		case 3:

			// Dividing an integer by an integer gives an integer answer
			// which does not contain a decimal, using float or double fixes
			// this problem.
			System.out.println("Input an integer");
			int div1 = scan.nextInt();
			float div3 = div1;
			System.out.println("Input another integer");
			int div2 = scan.nextInt();
			float div4 = div2;
			int division = div1 / div2;
			float remdivision = div3 / div4;
			System.out.println("Answer without remainder " + division);
			System.out.println("Answer with remainder " + remdivision);
			break;

		case 4:
			System.out.println("Input an integer");
			double mult1 = scan.nextInt();
			System.out.println("Input another integer");
			double mult2 = scan.nextInt();
			double multiplication = mult1 * mult2;
			System.out.println(multiplication);
			break;
		}
		scan.close();

	}
}
