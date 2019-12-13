// Random number generator guessing game with loops (12/12/2019)

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Random rand = new Random();
    Scanner morgan = new Scanner(System.in);
    int randNum = rand.nextInt(50);
    int guess;
    int tries = 0;
    while (tries <= 5) {
      System.out.print("Please guess my number between 0 and 50: ");
      guess = morgan.nextInt();
      if (guess < randNum) {
        System.out.print("Your number is too low. Guess again.\n");
        tries++;
      } else if (guess > randNum) {
        System.out.print("Your number is too high. Guess again.\n");
        tries++;
      } else if (guess == randNum) {
        System.out.printf("Congrats!! You guessed the number in %s tries!", tries);
        break;
      }
    }
    if (tries == 5) {
      System.out.printf("Well shucks. You couldnt guess the number %s.", randNum);
      System.out.println("Better luck next time!");
      }
    }
  }
