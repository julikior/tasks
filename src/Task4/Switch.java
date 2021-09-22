package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {

    public static void main (String[] args) throws IOException {
        System.out.println("Enter any year");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int leap = year % 100 == 0 || year % 4 == 0 ? 0 : 1;

        switch (leap) {
            case 0:
                System.out.println(year + " - this is a leap year");
                break;
            case 1:
                System.out.println(year + " - this is not a leap year");
                break;
            default:
                System.out.println(year + " - this is not leap year");
        }
    }
}
