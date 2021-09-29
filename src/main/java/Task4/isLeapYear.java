package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isLeapYear {

    public static void main (String[] args) throws IOException {

        System.out.println("Enter any year");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if (year % 4 == 0) {
            System.out.println(year + " this is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " this is not a leap year");
        } else {
            System.out.println(year + " this is not a leap year");
        }
    }
}
