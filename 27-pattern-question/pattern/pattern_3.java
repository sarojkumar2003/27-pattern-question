// to print pattern Number triangle pattern 

public class pattern_3 {

public static void patern(int n) {
  for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= n-i; j++) {
      System.out.print(" ");
    }
    for (int j = 0; j <= i; j++) {
      System.out.print( i +" ");
    }
    System.out.println();
  }
}
  public static void main(String[] args) {
    patern(3);
  }
  
}
