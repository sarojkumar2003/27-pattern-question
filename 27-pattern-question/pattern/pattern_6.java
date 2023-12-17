//Q.6 to print pattern Number-changing pyramid


public class pattern_6 {
  
  public static void patern(int n) {
    int num = 0;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    patern(4);
  }
}
