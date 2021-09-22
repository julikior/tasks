package Task3;

import java.time.LocalTime;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(fizzBuzzCuckooClock("01:00"));
    }

    public static String fizzBuzzCuckooClock(String time) {
        LocalTime parsed_time = LocalTime.parse(time);
        int hours = parsed_time.getHour();
        int minutes = parsed_time.getMinute();

        if (minutes == 0) {
            int cockoo = hours % 12 == 0 ? 12 : hours % 12;
            return Stream.generate(() -> "Cuckoo").limit(cockoo).collect(Collectors.joining(" "));
        }

        if (minutes == 30) {
            return "Cuckoo";
        }

        return (minutes % 5 == 0 && minutes % 3 == 0) ? "Fizz Buzz" :
                (minutes % 3 == 0) ? "Fizz" :
                                (minutes % 5 == 0) ? "Buzz" : "tick";
    }

}


