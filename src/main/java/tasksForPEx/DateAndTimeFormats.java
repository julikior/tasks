package tasksForPEx;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormats {

  public static void main(String[] args) {
    new DateAndTimeFormats().getDateAndTimeFormats();
  }

  private void getDateAndTimeFormats() {

    Instant instant = Instant.now();
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter[] formatters = {
        DateTimeFormatter.ISO_LOCAL_DATE,
        DateTimeFormatter.ISO_LOCAL_TIME,
        DateTimeFormatter.ISO_LOCAL_DATE_TIME,
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"),
        DateTimeFormatter.ofPattern("dd::MMM::yyyy"),
        DateTimeFormatter.ofPattern("d::MMM::yyyy HH::mm::ss"),
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH::mm::ss.SSS"),
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH::mm::ss.SSS'Z'").withZone(ZoneOffset.UTC),
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH::mm::ss")
    };

    System.out.println("Default format of LocalDate: " + now.format(formatters[0]) + " " + now.format(formatters[4]));
    System.out.println("Default format of LocalTime: " + now.format(formatters[1]));
    System.out.println("Default format of LocalDateTime: " + now.format(formatters[2]) + " " + now.format(formatters[5]));
    System.out.println("Default format of LocalDateTimeWithZoneUTC: " + now.format(formatters[7]));
    System.out.println("Default format of Instant: " + instant.toString());
    System.out.println("Default format after parsing: " + LocalDateTime.parse("2014-04-27T21:39:48", formatters[2]));
  }
}
