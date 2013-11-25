// Lesson 27 - Packages

// Packages enable you to organize your code and find files easier
// Packages stop from having conflicts between class names
// You can have two different classes called Fish, as long as they're in different packages
// You can have packages within packages using dots
// You want to make sure that your package is unique
// As a convention, you reverse your website name: nl.floordrees.ocean

package ocean
// defined a package in Eclipse when creating the Fish class: ocean 
// package naming is lowercase

public class Fish { 
  
}

///

package ocean.plants;
  
public class Seaweed { 
  
}

///

package ocean.plants;
  
public class Algae { 
  
}

///

import ocean.Fish; 
import ocean.plants.Seaweed; 
// App is not in the ocean package
// Alternatively: import ocean.*;

public class App {
  public static void main(String[] args); {
    
    Fish fish = new Fish();
    Seaweed weed = new Seaweed();
    
  }
}