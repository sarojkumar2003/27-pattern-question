//Reverse number Triangle Pattern

public class pattern_18 {
  
  public static void pattern(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n-i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    pattern(6);
  }
}
