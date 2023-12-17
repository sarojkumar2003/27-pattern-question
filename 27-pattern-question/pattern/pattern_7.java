// Q.7 to print pattern Zero-One triangle 


public class pattern_7 {
  public static void pattern(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}
