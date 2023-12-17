// Q.1 print the square patern

public class pattern_1
{
  public static void patern(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println(" "); 
    }
    
  }  
  public static void main(String[] args) {
    patern(5);
  }
}