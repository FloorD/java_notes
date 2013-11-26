// Lesson 28 - Interfaces

// What if I want both Machine and Person have the method showInfo?
// In Eclipse: new>interface
// Name should start with uppercase letter
// Will create a new Java file
// You'll then need to put 'implements Info' in the files you want to use it for
// Interface is like a text contract
// Interfaces seperated by comma: implements Info, Description ...
// Use case: to group methods, make clear how objects will interact with eachother
// Use IName for your interface to make clear that it's an Interface
// 

// Info.java

public interface Info {
  public void showInfo();
}


// Machine.java

public class Machine implements Info { // <-
  
  private int id = 7
  
  public void start() {
    System.out.println("Machine started");
  }
  
  @Override // <-
  public void showInfo() {
    System.out.println("Machine ID is: " + id);
  }
}

/// Person.java

public class Person implements Info {
  
  private String name;
  
  public Person(String name) { // constructor for name
    this.name = name;
  }
  
  public void greet() {
    System.out.println("Hello, there");
      
  public void showInfo() {
    System.out.println("Person name is: " + name);
  }
}

// App.java

public class App {
  public static void main(String[] args); {
    
    Machine mach1 = new Machine();
    mach1.start();
    
    Person person1 = new Person();
    person1.greet();
    
    // Can't use interfaces with 'new', as new needs to be followed by a class name. You can however do this:
    Info info1 = new Machine();
    info1.showInfo();
    
    // Or this:
    Info info2 = person1;
    // As both Machine and Person implement(s) Info
    info2.showInfo();
    
    System.out.println();
    
    outputInfo(mach1);
    outputInfo(person1);
  }
  
  private static void outputInfo(Info info) {
    info.showInfo();
  }
}