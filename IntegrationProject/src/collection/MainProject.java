package collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProject {
  /*
   * Alex Rodriguez Integration Project, demonstrates what I can code and my
   * understanding.
   */

  static Scanner scan;

  public static void main(String[] args) {
    // Header = line 13 | Parameter = (String[] args) on line 12
    scan = new Scanner(System.in);

    System.out.println("Case 1 contains the definition of a "
        + "variable and list/description of Java-buit in data.");
    System.out.println(
        "Case 2 uses different variable types and integer" + " division.");
    System.out.println("Case 3 contains example of using a switch statement.");
    System.out
        .println("Case 4 contains example of using an if-else " + "statement.");
    System.out.println("Case 5 contains a for loop,"
        + " an array and use of a conditional operator.");
    System.out.println(
        "Case 6 uses an array to find the smallest amount and" + " sum.");
    System.out.println("Case 7 does not use set and get from private fields.");
    System.out.println("Case 8 contains miscillaneous code. \n");

    int num = 0;
    boolean userInputInt = false;
    while (userInputInt == false || num < 1 || num > 8) {

      System.out.println("Choose a number 1-8");

      try {

        System.out.print(": ");

        num = scan.nextInt();
        userInputInt = true;
      }

      catch (InputMismatchException e) {
        System.out.println("Your input was not an integer.");
        scan.nextLine();
      } 
      
      catch (Exception e) {
        System.out.println("Unknown error Occured");
        scan.nextLine();
      }

    }

    switch (num) {

      case 1:
        CaseOne case1 = new CaseOne();
        case1.case1(); // Method call
        break;

      case 2:
        CaseTwo case2 = new CaseTwo();
        case2.case2();
        break;

      case 3:
        CaseThree case3 = new CaseThree();
        case3.case3();
        break;

      case 4:
        CaseFour case4 = new CaseFour();
        case4.case4();
        break;

      case 5:
        CaseFive case5 = new CaseFive();
        case5.case5();
        break;

      case 6:
        CaseSix case6 = new CaseSix();
        case6.case6();
        break;

      case 7:
        CaseSeven case7 = new CaseSeven();
        case7.case7();
        break;

      case 8:
        CaseEight case8 = new CaseEight();
        case8.case8();
        break;

      default:
        System.out.println("Number is not valid, input a number 1-8");
        break;

    }
    scan.close();
  }

}
