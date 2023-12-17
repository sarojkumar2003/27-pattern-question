// Q.4 to print pattern Number-increasing pyramid  


public class pattern_4 {
  public static void patern(int n) {
    for (int i = 1 ; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();;
    }
  }
  
  public static void main(String[] args) {
    patern(3);
  }
}
