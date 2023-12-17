//Q.5 TO to print pattern Number-increasing reverse pyramid 

public class pattern_5 {
  
  public static void pattern(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(j);
      }
    System.out.println();
  }
  }

public static void main(String[] args) {
  pattern(3);
}

}
