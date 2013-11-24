// Lesson 22 - Constructors

class Machine {
  private String name;
  private int code;
  
  /*
  public Machine() {
    
    System.out.println("constructor is running!");
    // constructor, often used for int instance variables
    name = "Arnie";
  }
  */
    
  // calling a constructor within another constructor:
  public Machine() {
    
    System.out.println("constructor is running!");
    this ("Arnie, 0");
  }
  
  // this(); >> no parameters
  
  public Machine(String name) {
    this(name, 0); // ?
    
    System.out.println("Second constructor running")
    this.name = name;
  }
  
  public Machine(String name, int code) {
    
    System.out.println("Third constructor running")
      this.name = name;
      this.code = code;
  }
}

public class App {
  public static void main(String[] args) {
    Machine machine1 = new Machine();
    
    Machine machine2 = new Machine("Bertie"); 
    // calls the second constructor, as the second constructor accepts a string
  
    Machine machine3 = new Machine("Chalky", 324266); 
    // calls the right constructor based on the parameters list
  }
}