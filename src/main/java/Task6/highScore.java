//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

package Task6;

import java.util.Arrays;
import java.util.Comparator;

public class highScore {

    public static void main (String[] args){
        System.out.println(high("man i need a taxi up to ubud"));
    }

    public static String high(String s) {

        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(word -> word.chars().map(charr -> charr - 96).sum()))
                .get();
    }
}
