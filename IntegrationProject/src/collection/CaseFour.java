package collection;

import java.util.Scanner;

public class CaseFour {

	void case4() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Case 4 \n");

		System.out.println("Input a number");
		int usernum = scan.nextInt();
		// if else statements and nested if statements

		if (usernum % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		if (usernum >= 100) {
			System.out.println("Greater than or equal to 100");
		} else if (usernum >= 50) {
			System.out.println("Greater than or equal to 50");
			if (usernum >= 90) {
				System.out.println("Number is in the 90s");
			} else if (usernum >= 80) {
				System.out.println("Number is in the 80s");
			} else if (usernum >= 70) {
				System.out.println("Number is in the 70s");
			} else if (usernum >= 60) {
				System.out.println("Number is in the 60s");
			} else {
				System.out.println("Number is in the 50s");
			}
		} else if (usernum >= 0) {
			System.out.println("Greater than or equal to 0");
			if (usernum >= 40) {
				System.out.println("Number is in the 40s");
			} else if (usernum >= 30) {
				System.out.println("Number is in the 30s");
			} else if (usernum >= 20) {
				System.out.println("Number is in the 20s");
			} else if (usernum >= 10) {
				System.out.println("Number is in the 10s");
			} else {
				System.out.println("Number is a single digit or zero");
			}
		} else {
			System.out.println("Number is negative");
		}
		scan.close();
	}

}
