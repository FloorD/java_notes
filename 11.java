// Lecture 11 - Getting User Input

import java.util.Scanner; // ctrl+^+o public class App { public
static void main(String[] args) { 
  Scanner input = new
    Scanner(System.in); // Scanner class with input variable
    System.out.println("Enter an integer: "); 
    int value = input.nextInt(); 
    System.out.println("You entered: " + value); //output to the user what the entered 
  } 
}


import java.util.Scanner; // ctrl+^+o
public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Scanner class with input variable
    System.out.println("Enter a line of text: ");
    String line = input.nextline();
    System.out.println("You entered: " + line); //output to the user what the entered 
  }
}
