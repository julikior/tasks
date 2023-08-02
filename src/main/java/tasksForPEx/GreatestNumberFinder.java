package tasksForPEx;

import java.util.Scanner;

public class GreatestNumberFinder {

  public static void main(String[] args) {
      System.out.println("The greatest number is: " + getGreatestNumber());

  }

  public static Integer getGreatestNumber() {
    int num1, num2, num3;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    String input = scanner.nextLine();

    // Remove any commas from the input
    input = input.replaceAll(",", "");
    String[] numbers = input.split("\\s+");

    if (numbers.length != 3) {
      System.out.println("Invalid input. Please enter exactly three numbers separated by commas.");
      return null;
    }

    try {
      num1 = Integer.parseInt(numbers[0]);
      num2 = Integer.parseInt(numbers[1]);
      num3 = Integer.parseInt(numbers[2]);
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. Please enter valid numeric values.");
      return null;
    }

    int max = num1;

    if (num2 > max) {
      max = num2;
    }

    if (num3 > max) {
      max = num3;
    }
    return max;
  }
}
