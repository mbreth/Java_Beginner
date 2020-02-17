// Counting down a user number until the digits match each other (2/16/20)


import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    int userNum;
    userNum = scnr.nextInt();
    while (userNum / 10 != userNum % 10) {
      System.out.println(userNum-- + " ");
    }
    System.out.println(userNum);
   }
}
