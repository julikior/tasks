package Task3;

import java.time.LocalTime;


public class FizzBuzzCuckooClock {

    public static void main(String[] args) {
        System.out.println(fizzBuzzCuckooClock("15:00"));
    }

    public static String fizzBuzzCuckooClock(String time) {
        LocalTime parsed_time = LocalTime.parse(time);
        String result;

        if (parsed_time.getMinute() == 0) {
            result = "Cuckoo";
            int hours = parsed_time.getHour();
            if (hours == 0) {
                hours = 12;
            }
            else if (hours > 12) {
                hours = hours - 12;
            }
            for (int i = 1; i <= hours - 1; i++) {
                result = result + " Cuckoo";
            }

            return result;
        }
        else {
            return "tick";
        }
    }
}