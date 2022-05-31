package myapp.core;

import java.io.Console;

public class SumWhile {

  public static void main(String[] args) {
    Console cons = System.console();

    String input = "0";
    int sum = 0;

    while (input.length() > 0) {
      
      input = cons.readLine("Please enter a number. Blank to end ");

      if (input.length() > 0) {
        System.out.printf(">>> %s\n", input);
        int operand = Integer.parseInt(input);
        sum += operand;
      }
      
    }
    System.out.printf("The sum is %d", sum);
  }
  
}
