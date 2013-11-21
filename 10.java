// Lecture 10 - "If"

public class Application {
  public static void main(String[] args) {
    int loop = 0;
    while(true) {
      System.out.println("Looping: " + loop);
      if (loop == 5) {
        break;
      }
      loop++;
      System.out.println("Running");
    }
  }
}

//if and else if are mutually exclusive. follows chronologically. add an else for 'none of the above'

public class Application {
  public static void main(String[] args) {
    int myInt = 20;
    if(myInt > 10) {
      System.out.println("Yes, it's true");
    }
    else if(myInt < 20) {
      System.out.println("No, it's false");
    }
  }
}

public class Application {
  public static void main(String[] args) {
    int myInt = 20;
    if(myInt > 10) {
      System.out.println("Yes, it's true");
    }
  }
}

public class Application {
  public static void main(String[] args) {
    if(4 == 4) {
      System.out.println("Yes, it's true");
    }
  }
}

public class Application {
  public static void main(String[] args) {
    boolean cond = 3 != 8;
    System.out.println(cond);
  }
}
