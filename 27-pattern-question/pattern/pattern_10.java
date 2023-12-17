// Q.10 To print the star pattern


public class pattern_10 {

  public static void patern(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= 2*i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

     for (int i = n-1; i >=0; i--) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= 2*i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    patern(3);
  }
  
}
