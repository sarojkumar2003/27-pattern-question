// Hollow Hourglass Pattern


public class pattern_24 {
  
  public static void patern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = i; j <= n; j++) {
        if (j == i || j == n || i == 1) {
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }

      }
      System.out.println();
    }
    
    for (int i = n-1; i >= 1 ; i-- ) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = i; j <= n; j++) {
        if (j == i || j == n || i == 1 ) {
          System.out.print(" *");
        }
        else {
          System.out.print("  ");
        }
        
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    patern(6);
  }
}
