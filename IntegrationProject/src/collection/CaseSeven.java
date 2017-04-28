package collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaseSeven {

  void case7() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Case 7 \n");

    Math math = new Math();

    double one = 0;
    double two = 0;
    boolean userInputdouble = false;
    while (userInputdouble == false) {

      System.out.println("Input a number");

      try {
        System.out.print(": ");
        one = scan.nextDouble();

        System.out.println("Input another number");
        System.out.print(": ");
        two = scan.nextDouble();
        userInputdouble = true;

      } catch (InputMismatchException e) {
        System.out.println("Your input was not a number, try again.");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Unkown error Occured, try again.");
        scan.nextLine();
      }
    }

    boolean userInputTest = false;
    while (userInputTest == false) {
      System.out.println(
          "Input an operation you want to" + " perform on the two numbers.");
      System.out
          .println("You can choose to sum, subtract, multiply and divide.");

      System.out.print(": ");
      String choice = scan.next();

      if (choice.equalsIgnoreCase("sum") || choice.equalsIgnoreCase("subtract")
          || choice.equalsIgnoreCase("multiply")
          || choice.equalsIgnoreCase("divide")) {
        userInputTest = true;
      }

      choice = choice.toLowerCase();

      switch (choice) {

        case "sum":
          math.sum(one, two);
          break;

        case "subtract":
          math.subtract(one, two);
          break;

        case "multiply":
          math.multiply(one, two);
          break;

        case "divide":
          math.divide(one, two);
          break;

        default:
          System.out.println("Sorry operation was not understood. \n");
          break;
      }
    }
    scan.close();
  }

  class Math {

    private void sum(double one, double two) {
      double result = one + two;
      System.out.println(result);
    }

    private void subtract(double one, double two) {
      double result = one - two;
      System.out.println(result);
    }

    private void multiply(double one, double two) {
      double result = one * two;
      System.out.println(result);
    }

    private void divide(double one, double two) {
      double result = one / two;
      System.out.println(result);
    }
  }

}
