// This code demonstrates reading a user input character

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    char userKey;
    System.out.println("Please provide a character:");
    userKey = scnr.next().charAt(0);
    System.out.printf("You typed in %s", userKey);
  }
}
