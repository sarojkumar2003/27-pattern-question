//Hollow Reverse Triangle Pattern


public class pattern_22 {
  
  public static void pattern(int n) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j < n-i ; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < 2 * n - 1; j++) {
        if(j == 1 || i == n-1 || j == (2*i-1)){
        System.out.print("*");
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
