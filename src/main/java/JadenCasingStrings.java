//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

public class JadenCasingStrings {

    public static void main (String[] args) {
        System.out.println(toJadenCase("Most Trees Are Blue"));
    }

    public static String toJadenCase(String phrase){

        if (phrase == null || phrase.length() == 0) {
            return null;
        }

        String[] words = phrase.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = Capitalize(words[i]);
            result += words[i] + " ";
        }
        return result;
    }

    private static String Capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
