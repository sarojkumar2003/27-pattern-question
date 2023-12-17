//Hollow Triangle Pattern


public class pattern_21 {
  public static void pattern(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < 2 * n - i; j++) {
        if (j == 1 || i == n || i == n - 1 || j == 2 * i - 1) {
          System.out.print("* ");
        } else {
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
