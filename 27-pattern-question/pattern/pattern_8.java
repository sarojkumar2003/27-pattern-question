// Q.8 to print Rhombus pattern 

public class pattern_8 {

  public static void patern(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
  patern(4);    
  }
  
}
