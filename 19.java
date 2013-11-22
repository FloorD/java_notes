// Lesson 19 - Getters and returnings values

class Person {
  String name;
  int age;
  
  void speak() {
    System.out.println("My name is: " + name);
  }
  
  int calculateYearsToRetirement() { // to make it just return, change void into int
    int yearsLeft = 65 - age;
    
    //System.out.println(yearsLeft);
    
    return yearsLeft;
  }
  
  int getAge() { // getter
    return age;
  }
  
  String getName() { // getter
    return name;
  }
}
  
  
public class App {
  public static void main(String[] args) {
    Person person1 = new Person(); 
    
    person1.name = "Joe"
    person1.age = 25
    //person1.speak();
    //person1.calculateYearsToRetirement();
    
    int years = person1.calculateYearsToRetirement(); // equel to what you return in the person class
    
    System.out.println("Years till retirement " + years);
    
    int age = person1.getAge();
    
    System.out.println("Age is" + age);
    
    String name = person1.getName();
    
    System.out.println("My name is: " + name)
    
    
  }
}