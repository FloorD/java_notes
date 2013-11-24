// Lesson 20 - Method Parameters

// Passing a parameter to a method:

class Robot {
  public void speak(String text) {
    System.out.println(text);
  }
  
  public void jump(int height) {
    System.out.println("Jumping: " + height)
  }
  
  public void move(String direction, double distance) { // seperate by comma's
    System.out.println("Moving: " + distance + " metres in direction " + direction);
  }
}

public class App {
  public static void main(String[] args) {
    Robot bottie = new Robot(); 
    
    bottie.speak("Hi, I'm Bottie"); 
    bottie.jump(7);
    bottie.move("West", 5);
    
    /*
    String greeting = "Hello there"; // 'greeting' is like a label
    bottie.speak(greeting);
    
    int value = 14
    sam.jump(value);
    */
  }
}