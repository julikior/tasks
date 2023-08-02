package tasksForPEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringEndings {

  public static void main (String[] args) {
    new StringEndings().getStringEnding();
  }

  private void getStringEnding() {
    List<String> matchedWords = new ArrayList<>();
    //String matchedWord = "";
    File file = new File("/Users/yuliiapuziuk/Downloads/sample-2mb-text-file.txt");
    String wordEnding = "inc";

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNext()) {
        String word = scanner.next();

        // Remove any punctuation marks from the word
        word = word.replaceAll("[^a-zA-Z]", "");

        if (word.toLowerCase().endsWith(wordEnding.toLowerCase())) {
          matchedWords.add(word);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file.getAbsolutePath());
    }

    if (matchedWords.isEmpty()) {
      System.out.println("No words found in the file.");
    } else {
      System.out.println("Matched words in the file:");
      for (String matchedWord : matchedWords) {
        System.out.println(matchedWord);
      }
    }
  }
}
