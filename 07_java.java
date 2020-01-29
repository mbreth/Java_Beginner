// Manipulating strings provided from user

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    String userInput;
    String result = "";
    int number;
    System.out.println("I will show you something neat!");
    System.out.println("Please provide a word:");
    userInput = reader.next();
    System.out.println("Thank you. Now please provide an integer between 1 and 10:");
    number = reader.nextInt();
    for (int i = 0; i < userInput.length(); i++) {
      for (int j = 0; j < number; j++) {
        result += userInput.charAt(i);
      }
    }
    System.out.println(result);
    System.out.println("See what I did there?");
  }
}
