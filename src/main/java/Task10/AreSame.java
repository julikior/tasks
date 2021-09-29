//https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
package Task10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AreSame {

    public static void main(String[] args) {
        System.out.println(comp(new int[]{0, -14, 191, 161, 19, 144, 195, 1},
                new int[]{1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195}));
    }

    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null) {
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }
        if (a.length > b.length || a.length < b.length) {
            return false;
        }

        List<Integer> listB = Arrays.stream(b).sorted().boxed().collect(Collectors.toList());
        List<Integer> listA = Arrays.stream(a).map(i -> i * i).sorted().boxed().collect(Collectors.toList());
        System.out.println(listA);
        System.out.println(listB);

        return listA.equals(listB);

    }
}
