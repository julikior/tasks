//https://www.codewars.com/kata/588e0f11b7b4a5b373000041/train/javascript

package Task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TemperatureAnalysis {

    public static void main (String[] args) {

        System.out.println(getMin("-2 3 -1 -12 45 14"));
    }

    public static Integer getMin(String temperature) {

        String[] split = temperature.split(" ");

        if (temperature.length() == 0) {
            return null;
        }

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            newList.add(Integer.parseInt(split[i]));
        }

        return newList.stream().min(Comparator.naturalOrder()).get();
    }
}
