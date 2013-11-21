// Lesson 16 - Multi-Dimensional arrays

public class App { // one-dimensional
  public static void main(String[] args) {
    int[] values = {3, 5, 2343};
    System.out.println(values[2]); // 2343
  }
}

public class App { // two-dimensional
  public static void main(String[] args) {
    int[][] grid = { // an array of arrays
      {3, 5, 2343}, // row
      {2, 4},
      {1, 2, 3, 4},
    };
    
    System.out.println(grid[1][1]); //array index; row, column 
    
    String[][] texts = new String[2][3];
    
    texts[0][1] = "Hello there";
    
    System.out.println(texts[0][1]);
    
    for(int row=0; row<grid.length; row++) {
      for (int col=0; col<grid[row].length; col++) {}
        System.out.print(grid[row][col] + "\t"); // \t = tab
      }
      System.out.println(); //create new line
    }
  }
}