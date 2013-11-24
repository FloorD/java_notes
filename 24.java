// Lesson 24 - String builder and string formatting

public class App {
  public static void main(String[] args) {
    
    /* inefficient
    String info = ""; 
    // empty string, no matter what new strings you create below:
    
    info += "My name is Bob.";
    info += " ";
    info += "I am a builder.";
    
    System.out.println(info);
    
    // BUT: strings are immutable. Once you've created it, you can never change it
    */
      
    StringBuilder sb = new StringBuilder(""); // previously called StringBuffer 
    
    sb.append("My name is Sue");
    sb.append(" ");
    sb.append("I am a lion tamer");
    // not creating a new StringBuilder, simply modifying the contents
    
    System.out.println(sb.toString);
    
    // method chaining:
    
    StringBuilder s = new StringBuilder();
    
    s.append("My name is Roger").append(" ").append("I am a skydiver");
    
    System.out.println(s.toString);
    
    // Formatting:
    System.out.println("Here is some text.\t That was a tab.\n That was a new line.");
    
    System.out.printf("Total cost: %10d, quantity is %d\n", 5, 120}; 
    // special formatting options
    // for every %d you need to have an argument down the line to replace it with
    // %10d == outputted in a field that is 10 characters wide
    // %-10d == aligned left
    
    for(int i=0; i<20; i++);
    System.out.printf("%2d: %s\n", i, "some text here");
    // your list will be nicely aligned as al digits take up 2 characters. 
    // %s == string
    
    System.out.printf("Total value: %.2f\n", 5.6);
    // %f == floating point
    // %.2f == 2 decimal places (rounding up)
    // %6.1f == floating point taking up 5 characters and 1 decimal place (punctuation included)
  }
}