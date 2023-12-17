  // Q.13 to print  Pyramid pattern


public class pattern_13 {

  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.err.print("*");
      }
      System.out.println();
    }
    
  }
  public static void main(String[] args) {
    pattern(6);
  }


}
