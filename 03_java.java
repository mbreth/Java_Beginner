// Practicing calling multiple functions (12/12/2019)

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    isEven evenTest = new isEven();
    isOdd oddTest = new isOdd();
    Scanner number = new Scanner(System.in);
    int num;
    System.out.print("Give me an integer to test for odd or even: ");
    num = number.nextInt();
    if (num % 2 == 0) {
      evenTest.even();
    } else {
      oddTest.odd();
    }
  }
}

class isEven {
  public void even() {
    System.out.print("The number you chose was even!");
  }
}

class isOdd {
  public void odd() {
    System.out.print("The number you chose was odd!");
  }
}
