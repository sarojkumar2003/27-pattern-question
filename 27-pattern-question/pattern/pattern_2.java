//Q.2 to print the Number triangle Pattern


public class pattern_2 {
  public static void patern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println( );
    }
  }
  public static void main(String[] args) {
    patern(6);
  }
}
