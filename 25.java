// Lesson 25 - The toString() method

public class App {
  public static void main(String[] args); {
    Object obj = new Object();
    // obj as an Object has a whole bunch of predefined methods in Eclipse, like equals() and hashCode() int.
  }
}

//////////////////

class Frog {
  
  private int id;
  private String name;
  
  public Frog(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public String toString() {
    //return "Hello"; 
    // string representation for you object
    
    //return id + ": " + name; 
    // a lot of string object flying about
    
    StringBuilder sb = new StringBuilder();
    sb.append.(id).append(": ").append(name);
    return sb.toString();
    // everytime you put a + between strings, you're basically creating a new string instead of extending it.
    
    // formatted toString(); using the String.format method
    return String.format("%1d: %s", id, name)
  }
}

public class App {
  public static void main(String[] args); {
    Frog frog1 = new Frog(7, "Freddy");
    Frog frog2 = new Frog(5, "Roger");
    
    System.out.println(frog1);
    System.out.println(frog2);
  }
}