//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
package Task9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());

        listA.removeAll(listB);

        return listA.stream().mapToInt(Integer :: intValue).toArray();
    }

}
