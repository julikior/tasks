package tasksForPEx;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthOnCurrentDate {

  public static void main (String[] args) {
    System.out.println("Current month is : " + getFullNameOfCurrentMonth());
  }

  private static String getFullNameOfCurrentMonth() {
    LocalDate currentDate = LocalDate.now();
    return currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
  }
}
