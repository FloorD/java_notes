// Lesson 29 - Public, Private, Protected (access specifyers)

// Plant.java

public class Plant {
  
  // bad practice:
  public String name; // access it from anywhere
  
  // instead, acceptable is:
  public final static int ID = 8; // ID because it's a constant
  
  protected String size; //accessible within the class and child-classes
  
  private String type; // only accessible from within the class
  
  int height;
  
  public Plant() {
    name = "Freddy"; // this.name is superfluous
    this.type = "plant";
    this.size = "large";
    this.height = 8;
  }
}

// Oak.java

public class Oak extends Plant {
  
  public Oak() {
    type = "tree" // won't work as type is a private method of class Plant
  }
  
  this.size = "large";
  // this works as size is protected and Oak is a subclass of Plant
  
  // No access specifier; works because Oak and Plant are in the same package
  this.height = 10;
}

// Field.java

public class Field {
  private Plant plant = new Plant();
  
  // size is protected and Field is in the same package as Plant
  public Field() {
    // won't work; Grass is not in the same package as Plant, even though it's a subclass
    System.out.println(plant.size);
  }
}

// Grass.java

import world.Plant;

public class Grass extends Plant {
  public Grass() {
    System.out.println();
  }
}

// App.java

public class App {
  public static void main(String[] args); {
    
    Plant plant = new Plant();
    
    System.out.println(plant.ID);
    
    // won't work; App and Plant are in different packages, height has package-level visibility
    System.out.println(plant.height); 
  }
}