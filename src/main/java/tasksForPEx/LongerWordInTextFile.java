package tasksForPEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongerWordInTextFile {

  public static void main(String [ ] args) {
    String longestWord = getLongestWords();
    System.out.println("Longest word in the file: " + longestWord);
  }

  public static String getLongestWords() {

    String longestWord = "";
    File file = new File("/Users/yuliiapuziuk/Downloads/sample-2mb-text-file.txt");

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNext()) {
        String word = scanner.next();

        // Remove any punctuation marks from the word
        word = word.replaceAll("[^a-zA-Z]", "");

        if (word.length() > longestWord.length()) {
          longestWord = word;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file.getAbsolutePath());
    }

    if (longestWord.isEmpty()) {
      System.out.println("No words found in the file.");
    }

    return longestWord;
  }
}
