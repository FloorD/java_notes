// Lesson 23 - Static (and final)

class Thing {
  public final static int LUCKY_NUMBER = 7; 
  // final = you can't assign another value to it
  
  // static is also great to count your values
  public static int count = 0;
  
  // static is also great for assigning an id to your object(s)
  public int id;
  
  public Thing() {
    // constructor
    id = count;
    count++;
  }
  
  public String name; 
  // instance variable
  public static String description; 
  // static vs non-static
  // public static .. is a class variable
  
  public void showName() {
    System.out.println("Object id" + id + ", " + description + ": " + name);
  }
  
  public static void showInfo() {
    System.out.println(description);
    // won't work System.out.println(name);
  }
}

public class App {
  public static void main(String[] args) {
    
    Thing.description = "I am a thing";
    
    // System.out.println(Thing.description);
    
    Thing.showInfo();
    
    System.ou.println("Created things are: " + Thing.count);
    
    Thing thing1 = new Thing();
    Thing thing2 = new Thing();
    
    thing1.name = "eep";
    thing2.name = "meep";
      
    // System.out.println(thing1.name);
    // System.out.println(thing2.name);
    
    thing1.showName();
    thing2.showName();
    
    // use of static:
    System.out.println(Math.PI); 
    // Math.PI is a constant == unchangable.You can't say 'Math.PI = 3;'
    
    System.out.println(Thing.LUCKY_NUMBER);
    // constant values by convention are in uppercase, words divided by underscore
  }
}
