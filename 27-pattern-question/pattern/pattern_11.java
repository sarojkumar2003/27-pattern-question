// Q.11 To Print the Palindrome Triangle Pattern

public class pattern_11 {
  
  public static void patern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print(j+" ");
      }
    System.out.println();
   }
  }

  public static void main(String[] args) {
    patern(4);
  }
}
