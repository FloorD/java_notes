// Lesson 21 - Setters and "this"

class Frog {
  private String name;
  private int age;
  
  // Setter:
  public void setName(String newName) {
    name = newName;
  }
  
  /* reference to the object:
  public void setName(String name){
    this.name = name;
  }
  */
  
  public void setAge(int newAge) {
    age = setAge
  }
  
  /*
  public void setAge(int age){
    this.age = age;
  }
  */
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  /*
  public void setInfo(String name, int age){
    setName(name);
    setAge(age);
  }
  */
}

public class App {
  public static void main(String[] args){
    Frog frog1 = new Frog();
    
    // frog1.name = "Ernest"; 
    // frog1.age = 3; 
    
    // calling a method instead of setting it with an equal sign
    // incapsulating data
    frog1.setName("Ernest");
    frog1.setAge(3);
    
    System.out.pintln(frog1.getName()); // getter
  }
}