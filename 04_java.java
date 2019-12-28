// Passing variables through methods (12/28/2019)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    nameChecker checker = new nameChecker();
    Scanner reader = new Scanner(System.in);
    String user_name;
    System.out.print("What is your name? ");
    user_name = reader.next();
    checker.name(user_name);
  }
}

class nameChecker {
  public void name(String user) {
    int length = user.length();
    if (length > 10) {
      System.out.print("Your name is over 10 characters long!");
    } else if(length <= 10) {
      System.out.print("Your name is less than 10 characters.");
    }
  }
}
