// Q.12 to print Butterfly Pattern

public class pattern_12 {
   
  public static void patern(int n) {
    for (int i = 1; i <= n; i++) {
      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // inner loop to print spaces
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // inner loop to print spaces
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // inner loop to print stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    patern(4);
  }
}
