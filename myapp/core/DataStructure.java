package myapp.core;

import java.util.*;

public class DataStructure {
  public static void main(String[] args) {

    // Create a list of Integer
    // List - generics
    List<Integer> intlist = new LinkedList<Integer>();
    intlist.add(Integer.parseInt("42"));
    intlist.add(10);
    intlist.add(50);
    intlist.add(2, 15);

    System.out.println(intlist);

    for (int i =0; i < intlist.size(); i++) {
      System.out.printf("%d = %d\n", i, intlist.get(i));
    }

  }
}
