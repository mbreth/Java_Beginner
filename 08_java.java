// Convert an integer number to binary (2/16/2020)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInput = scnr.nextInt();
    int count = 0;
    int a;
    String x = ""; 
    while (userInput > 0) {
      a = userInput % 2;
      if (a == 1) {
        count++;
      }
      x = x + "" + a;
      userInput = userInput / 2;
    }
    System.out.println(x);
  }
}
