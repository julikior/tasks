// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

package Task5;

public class stringEnds {


    public static void main (String[] args) {
        System.out.println(solution("abc", "w"));
    }

    private static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
