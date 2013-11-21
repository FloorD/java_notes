// Lecture 12 - Do ... While

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value = 0;
    do {
      System.out.println("Enter a number: ");
      value = scanner.nextInt();
    }
    while(value 1 !=5); // won't work as value is declared in curly brackets before
      System.out.println("Got 5!"); 
    }
  }

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value = 0;
    do {
      System.out.println("Enter a number: ");
      value = scanner.nextInt();
    }
    while(value 1 !=5); // won't work as value is declared in curly brackets before
      System.out.println(&quot;Got 5!&quot;); 
    }
  }
}

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter a number: ");
      int value = scanner.nextInt();
    }
    while(value 1 !=5); // won't work as value is declared in curly brackets before
      System.out.println("Got 5!"); 
    }
  }
}

// multiline comment /* */

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int value = scanner.nextInt();
    while(value !=5) {
    }
  }
}
