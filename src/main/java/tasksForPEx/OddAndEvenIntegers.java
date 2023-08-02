package tasksForPEx;

import java.util.ArrayList;
import java.util.Scanner;

public class OddAndEvenIntegers {

  public static void main (String[] args) {
    new OddAndEvenIntegers().getOddAndEvenIntegers();
  }

  private void getOddAndEvenIntegers() {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    System.out.println("Enter integers (separated by spaces. Enter 'q' to quit):");
    String input = scanner.nextLine();
    String[] numbers = input.split("\\s+");

    for (String number : numbers) {
      int num = Integer.parseInt(number);

    if (num % 2 == 0) {
      evenNumbers.add(num);
    } else {
      oddNumbers.add(num);
    }
    }
    System.out.println("Odd values are : " + evenNumbers);
    System.out.println("Even values are : " + oddNumbers);
  }
}
