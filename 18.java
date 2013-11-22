// Lesson 18 - Subroutines in classes (methods)

class Person { 
  String name;
  int age;
  
  // but we have more than data, behavior:
  void speak() {
    // methods (speak in this case)start with lowercase letter
    for(int i=0; i<3; i++){
      System.out.println("My name is: " + name + " and I am " + age + " years old.");
    }
  }
  
  void sayHello() {
    System.out.println("Hello!");
  }
}

public class App 
  public static void main(String[] args) { 
    Person person1 = new Person();
    person1.name = "Joe Bloggs";
    person1.age = 37;
    person1.speak(); //
    person1.sayHello();
    
    Person person2 = new Person();
    person2.name = "Sarah Smith";
    person2.age = 20;
    person2.speak();
    person2.sayHello();
    
    System.out.println(person1.name);
    
  }
}
