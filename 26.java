// Lesson 26 - Inheritance

public class Machine {
  
  private String name = "Machine Type 1" 
    // only accessible within Machine, not within Car
  
  protected String name = "Machine Type 1" 
    // accessible within the package, so also by the child class Car
  
  public void start() {
    System.out.println("Machine started");
  }
  
  public void stop() {
    System.out.println("Machine stopped");
  }
}

public class Car extends Machine { // Machine is parent of Car
  
  // taking from the parent class to override it:
  public void start() { 
    System.out.println("Car started");
  }
  
  // better way to override a method from the parent class
  @Override // will check if you really are overriding
  public void startd() { //startd
    // super.start();
    System.out.println("Car started");
  }
  
  public void wipeWindShield() {
    System.out.println("Wiping screen")
  }
}



public class App {
  public static void main(String[] args); {
    
    Machine mach1 = new Machine();
    
    mach1.start();
    mach1.stop();
    
    Car car1 = new Car(); 
    // even with a class without methods defined by you, you still have a few methods, inherited from the Object class
    
    car1.start();
    car1.wipeWindShield();
    car1.stop();
  }
}

