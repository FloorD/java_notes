// Lesson 14 - Arrays

public class App {
  public static void main(String[ }] args) {
    int value = 7;
    
    int[ ] values; // values referes to, can't hold integers, creating a label instead of a bucket
    values = new int[3]; // values should be able to hold 3 integers
    System.out.println(values[0]); // first in the list is 0
    
    values[0] = 10;
    values[1] = 20;
    values[2] = 30;

    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2

    for (int i=0; i<values.length; i++) {
      System.out.println(values[i]);
    }

    int [ ] numbers = {5, 6, 7};
    for (int i=0; i<numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}