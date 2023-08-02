package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeter {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter your name:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = reader.readLine();
            if (!name.equals("Andrii")) {
                System.out.println("Hello, " + name + "!");
            } else {
                System.out.println("Hello, my love!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
