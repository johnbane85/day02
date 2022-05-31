package myapp.core;

public class SumAll {

  public static void main(String[] args) {

    int sum =0;
    //for loop
    for (int i = 0; i < args.length; i++) {
      System.out.printf("%s\n", args[i]);
      sum = sum + Integer. parseInt(args[i]);
    }

    System.out.printf("The sum is %d\n", sum);
  }
}
