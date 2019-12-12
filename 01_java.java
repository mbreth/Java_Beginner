// First Java Program (12/11/2019)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner morgan = new Scanner(System.in);
    String name;
    int age;

    System.out.print("What is your name?: ");
    name = morgan.next();
    System.out.print("How old are you?: ");
    age = morgan.nextInt();
    System.out.printf("Your name is %s.", name);
    System.out.printf(" And you are %s years old.", age);
    System.out.print(age > 50 ? "\nYou are quite old!" : "\nYou are still a youngin.");
  }
}
