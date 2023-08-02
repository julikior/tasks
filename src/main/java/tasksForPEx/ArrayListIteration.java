package tasksForPEx;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListIteration {

  public static void main(String[] args) {
    new ArrayListIteration().getArrayList();
  }

  private void getArrayList() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Dog");
    list.add("Cat");
    list.add("Rabbit");

    System.out.println("Elements in the ArrayList:");
    for (String element : list) {
      System.out.println(element);
    }

    System.out.println("Element positions:");
    if (list.isEmpty()) {
      System.out.println("No elements found in the list!");
    } else {
      for (int i = 0; i < list.size(); i++) {
        String elementPosition = list.get(i);
        System.out.println("Position " + i + " : " + elementPosition);
      }
    }
  }
}
