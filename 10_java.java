// Taking a letter and finding the occurance in a string (2/16/20)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    char letter;
    String word;
    int count = 0;
    letter = scnr.next().charAt(0);
    word = scnr.next();

    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letter) {
        count++;
      }
    }
    System.out.println(count);
   }
}
