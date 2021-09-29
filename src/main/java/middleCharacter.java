//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

public class middleCharacter {

    public static void main(String[] args){
        System.out.println(getMiddle("testing"));
    }

    public static String getMiddle(String word) {

        int length = word.length();

        if (length % 2 == 0) {
            if (length > 2) {
                return word.substring(length / 2 - 1, length / 2 + 1);
            } else {
                return word;
            }
        }
        return word.substring(length/2, length / 2 + 1);
    }
}
