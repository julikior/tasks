package tasksForPEx;

import java.sql.*;
import java.text.SimpleDateFormat;

public class SQLiteActions {

  public static void main(String[] args) {
    // Step 1: Create and connect to the SQLite database
    String url = "jdbc:sqlite:users";

    try (Connection conn = DriverManager.getConnection(url)) {
      // Step 2: Create a table (if it doesn't exist) and populate it with data
      Statement statement = conn.createStatement();
      statement.executeUpdate("DROP TABLE if exists users;");
      statement.executeUpdate("CREATE TABLE users (id INTEGER PRIMARY KEY, name TEXT NOT NULL, email TEXT NOT NULL, start_time TEXT);");
      statement.executeUpdate("INSERT INTO users (name, email, start_time) VALUES ('John Doe', 'john@example.com', '2023-07-31 12:00:00');");
      statement.executeUpdate("INSERT INTO users (name, email, start_time) VALUES ('Jane Smith', 'jane@example.com', '2023-08-01 12:00:00');");
      statement.executeUpdate("INSERT INTO users (name, email, start_time) VALUES ('John Snow', 'snow@example.com', '2023-06-01 12:00:00');");

      // Step 3: Select record with start time from DB
      String selectQuery = "SELECT start_time FROM users WHERE name = 'John Doe';";
      try (Statement stmt = conn.createStatement()) {
        ResultSet resultSet = stmt.executeQuery(selectQuery);
        if (resultSet.next()) {
          String startTime = resultSet.getString("start_time");

          // Step 4: Parse start time as date and increment it by 2 days
          java.util.Date parsedDate = java.sql.Date.valueOf(startTime.split(" ")[0]);
          java.util.Calendar cal = java.util.Calendar.getInstance();
          cal.setTime(parsedDate);
          cal.add(java.util.Calendar.DAY_OF_MONTH, 2);
          java.util.Date incrementedDate = cal.getTime();
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String formattedDate = dateFormat.format(incrementedDate);

          // Step 5: Update record in DB
          String updateQuery = "UPDATE users SET start_time = ? WHERE name = 'John Doe';";
          try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, formattedDate);
            int rowsAffected = updateStmt.executeUpdate();
            System.out.println("Record updated successfully.");
          }
        } else {
          System.out.println("No record found with the specified condition.");
        }
      }
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e.getMessage());
    }
  }
}
