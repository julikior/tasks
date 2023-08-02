package tasksForPEx;

import java.util.Scanner;

public class TemperatureConverter {

  public static void main(String[] args) {
    int temperatureInCelsius = getTemperatureConverter();
    System.out.println("Temperature in Celsius: " + temperatureInCelsius);
  }

  public static Integer getTemperatureConverter() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = (fahrenheit - 32) * 5 / 9;

    return (int) celsius;
  }

}
