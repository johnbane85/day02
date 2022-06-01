package myapp.core;

import java.io.Console;
import java.util.*;

public class ShoppingList {

  public static void main(String[] args){

  List<String> cart = new LinkedList<String>();
  Console cons = System.console();
  boolean stop = false;
  String input;
  int delIndex;

  // main loop
  while(!stop) {
    input = cons.readLine("> ");

    System.out.printf("READ: %s\n",input);
    // <list of space separated items>
    // list
    // del <idx>
    // end

    String[] terms = input.split(" ");
    String cmd = terms[0];

    switch(cmd.trim().toLowerCase()) {
      case "add":
      for (int i = 1; i < terms.length; i++){
        String itemToadd = terms[i];
        cart.add(itemToadd);
        System.out.printf("%s added to cart \n", itemToadd);
      }
      break;

      case "list":
      if (cart.size() > 0) {
        for (int i = 0; i < cart.size(); i++) {
          System.out.printf("%d. %s\n", (i+1), cart.get(i));
        }
      } else {
        System.out.println("Your cart is empty");
      }
      break;

      case "del":
      if (terms.length < 2) {
        System.err.println("Please provide an index to delete");
      } else {
        delIndex = Integer.parseInt(terms[1]) - 1;
        if (delIndex < cart.size()) {
          cart.remove(delIndex);
          System.out.println("Deleted");
        } else {
          System.err.println("No such item");
        }
      }
      break;

      case "end":
          stop = true;
          System.out.println("Bye bye! Thank you for shopping");
          break;

      default:
      System.out.println("Unrecognised Command!. Please try again");
      break;

      
    }


 

  }

}
}