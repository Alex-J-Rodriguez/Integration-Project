package collection;

import java.util.Scanner;

public class CaseThree {

	void case3() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 3 \n");

		System.out.print("How many terms does the polynomial"
				+ " have not including the constant.");
		int casenum = scan.nextInt();

		int coe1, coe2, coe3, coe4, coe5;
		int degree1, degree2, degree3, degree4, degree5;

		switch (casenum) {

		case 1:
			System.out.println("Input the coefficient");
			coe1 = scan.nextInt();
			System.out.println("Input the degree");
			degree1 = scan.nextInt();
			coe1 = coe1 * degree1;
			System.out.println("The derivative of your function is " + coe1 + "x");
			break;

		case 2:
			System.out.println("Input the coefficient of the highest degree term");
			coe1 = scan.nextInt();
			System.out.println("Input the degree of the highest degree term");
			degree1 = scan.nextInt();
			System.out.println("Input the coefficient of the lowest degree term");
			coe2 = scan.nextInt();
			System.out.println("Input the degree of the lowest degree term");
			degree2 = scan.nextInt();

			// used the decrement operator to subtract 1 from the degree after it
			// is used to multiply
			coe1 = coe1 * degree1--;
			coe2 = coe2 * degree2--;

			System.out.print("The derivative of your function is ");
			System.out.print(+coe1 + "x^" + degree1);
			System.out.println(" + " + coe2 + "x^" + degree2);
			break;

		case 3:
			System.out.println("Input the coefficient of the highest degree term");
			coe1 = scan.nextInt();
			System.out.println("Input the degree of the highest degree term");
			degree1 = scan.nextInt();
			System.out.println("Input the coefficient of the second highest degree term");
			coe2 = scan.nextInt();
			System.out.println("Input the degree of the second highest degree term");
			degree2 = scan.nextInt();
			System.out.println("Input the coefficient of the lowest degree term");
			coe3 = scan.nextInt();
			System.out.println("Input the degree of the lowest degree term");
			degree3 = scan.nextInt();

			coe1 = coe1 * degree1--;
			coe2 = coe2 * degree2--;
			coe3 = coe3 * degree3--;

			System.out.print("The derivative of your function is " + coe1 + "x^" + degree1);
			System.out.print(" + " + coe2 + "x^" + degree2);
			System.out.println(" + " + coe3 + "x^" + degree3);
			break;
			
		case 4:
			System.out.println("Input the coefficient of the highest degree term");
			coe1 = scan.nextInt();
			System.out.println("Input the degree of the highest degree term");
			degree1 = scan.nextInt();
			System.out.println("Input the coefficient of the second highest degree term");
			coe2 = scan.nextInt();
			System.out.println("Input the degree of the second highest degree term");
			degree2 = scan.nextInt();
			System.out.println("Input the coefficient of the third highest degree term");
			coe3 = scan.nextInt();
			System.out.println("Input the degree of the third highest degree term");
			degree3 = scan.nextInt();
			System.out.println("Input the coefficient of the lowest degree term");
			coe4 = scan.nextInt();
			System.out.println("Input the degree of the lowest degree term");
			degree4 = scan.nextInt();

			coe1 = coe1 * degree1--;
			coe2 = coe2 * degree2--;
			coe3 = coe3 * degree3--;
			coe4 = coe4 * degree4--;

			System.out.print("The derivative of your function is " + coe1 + "x^" + degree1);
			System.out.print(" + " + coe2 + "x^" + degree2);
			System.out.println(" + " + coe3 + "x^" + degree3);
			System.out.println(" + " + coe4 + "x^"+ degree4);
			break;
			
		case 5:
			System.out.println("Input the coefficient of the highest degree term");
			coe1 = scan.nextInt();
			System.out.println("Input the degree of the highest degree term");
			degree1 = scan.nextInt();
			System.out.println("Input the coefficient of the second highest degree term");
			coe2 = scan.nextInt();
			System.out.println("Input the degree of the second highest degree term");
			degree2 = scan.nextInt();
			System.out.println("Input the coefficient of the third highest degree term");
			coe3 = scan.nextInt();
			System.out.println("Input the degree of the third highest degree term");
			degree3 = scan.nextInt();
			System.out.println("Input the coefficient of the fourth highest degree term");
			coe4 = scan.nextInt();
			System.out.println("Input the degree of the fourth highest degree term");
			degree4 = scan.nextInt();
			System.out.println("Input the coefficient of the lowest degree term");
			coe5 = scan.nextInt();
			System.out.println("Input the degree of the lowest degree term");
			degree5 = scan.nextInt();

			coe1 = coe1 * degree1--;
			coe2 = coe2 * degree2--;
			coe3 = coe3 * degree3--;
			coe4 = coe4 * degree4--;
			coe5 = coe5 * degree5--;

			System.out.print("The derivative of your function is " + coe1 + "x^" + degree1);
			System.out.print(" + " + coe2 + "x^" + degree2);
			System.out.println(" + " + coe3 + "x^" + degree3);
			System.out.println(" + " + coe4 + "x^"+ degree4);
			break;

		default:
			System.out.print("This only works for simple polynomials ");
			System.out.println("or there is a mistake that I'm not seeing.");
		}
		scan.close();
	}

}
