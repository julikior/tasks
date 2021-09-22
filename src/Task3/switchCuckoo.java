package Task3;

import java.time.LocalTime;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class switchCuckoo {

    public static void main(String[] args) {
        System.out.println(fizzBuzzCuckooClock("12:03"));
    }

    public static String fizzBuzzCuckooClock (String time) {
        LocalTime parsed_time = LocalTime.parse(time);
        int hours = parsed_time.getHour();
        int minutes = parsed_time.getMinute();

        switch (minutes) {
            case 0:
                int cockoo = hours % 12 == 0 ? 12 : hours % 12;
                return Stream.generate(() -> "Cuckoo").limit(cockoo).collect(Collectors.joining(" "));
            case 30:
                return "Cuckoo";
            case 15:
            case 45:
                return "Fizz Buzz";
            default:
                if (minutes % 3 == 0)
                    return "Fizz";
                else if (minutes % 5 == 0)
                    return "Buzz";
        }
        return "tick";
    }
}
