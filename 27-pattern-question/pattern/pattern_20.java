//to print the A shape in the java pattern

public class pattern_20 {

  public static void pattern(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        // printing stars.
        if (j == 1 || i == n || i == n-i || j == (2 * i - 1)) {
          System.out.print("*");
        }
        // printing spaces.
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    pattern(6);
  }
   
}
