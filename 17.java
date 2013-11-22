// Lesson 17 - Classes and objects

public class RedFruit { // RedFruit.java  
}


class Person { // person is an object, everything is an object
  // represents the idea of a person
  // Classes can contain: 
  
  // 1. Data - contains the state of the object (age, name, etc)
  // 2. Subroutines (methods)


  // Instance variables (data or "state")
  String name;
  int age;

}

public class App 
  public static void main(String[] args) { // main method
    Person person1 = new Person();
    person1.name = "Joe Bloggs";
    person1.age = 37;
    
    Person person2 = new Person();
    person2.name = "Sarah Smith";
    person2.age = 20;
    
  }
}

// Person = type of the variable
// person1 = name of the variable, equal to  
// new Person() = new person object
// .name = name of the variable


