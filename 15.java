// Lesson 15 - Arrays of Strings

public class App {
  public static void main(String[] args) {
    String [] words = new String[3];
    
    word[0] = "Hello";
    word[1] = "to";
    word[2] = "you";
    
    System.out.println(words[2]);
    
    String[] fruits = {"apple", "banana", "pear", "kiwi"};
    
    for(String fruit: fruits) {
      System.out.println(fruit);
    }
    
    int value = 0; // primitive type starts with lower-case
    String text = null; // default value
    System.out.println(text);
    
    String[] texts = new String[2];
    System.out.println(text[0]); // null
    
    texts[0] = "one";
  }
}