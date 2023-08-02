package tasksForPEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeAndDeserializeObjects {

  public static void main (String[] args) {
    new SerializeAndDeserializeObjects().getDeserializedObject();
  }

  private void getDeserializedObject() {
    // Serialize the object to a file
    Employee employee = new Employee("John Son", "Engineering", 33);
    String filename = "employee.txt";

    try {
      FileOutputStream fileOut = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(employee);
      out.close();
      fileOut.close();
      System.out.println("Object has been serialized into file " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialize the object from the file
    Employee deserializedEmployee = null;

    try {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      deserializedEmployee = (Employee) in.readObject();
      in.close();
      fileIn.close();
      System.out.println("Object has been deserialized from file  " + filename);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    // Retrieve deserialized object
    if (deserializedEmployee != null) {
      System.out.println("Deserialized object: " + deserializedEmployee);
    }
  }
}

// Example of class can be deserialized
class Employee implements Serializable {
  private String name;
  private String department;
  private int age;

  public Employee(String name, String department, int age) {
    this.name = name;
    this.department = department;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Employee [ name = " + name + ", department = " + department + ", age = " + age + " ]";
  }
}
