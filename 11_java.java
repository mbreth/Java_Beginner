// Taking an multiple words in a string and counting the characters minus spaces, periods or commas (2/16/20)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    String user;
    user = scnr.nextLine();
    String str = user.replaceAll("[' '.,]", "");
    System.out.println(str.length());
   }
}
