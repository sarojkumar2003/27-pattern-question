//K Pattern


public class pattern_27 {
  
  public static void pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i = n-1; i >= 1; i--) {
      for (int j = 0; j <= n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  public static void main(String[] args) {
    pattern(6);
  }
}
