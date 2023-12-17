// to print the Reverse Right Half Pyramid Pattern

public class pattern_14 {
  public static void patern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    patern(5);
    
  }
}
