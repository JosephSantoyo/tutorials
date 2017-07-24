/**
 * Auto Generated Java Class.
 */
public class PlayComputer {
  
  public static void main(String[] args) {
    System.out.println(mystery(14));
  }
  
  public static int helper(int n) {
    if (n < 10) {
      return 3;
    }
    
    if (n < 100) {
      return 2;
    } 
    
    return 1;
  }
  
  public static int mystery(int n) {
    int x = n;
    
    while (x < 200*n) {
      x = x + (x * helper(x));
    }
    
    return helper(x/10) + helper(n) + n;
  }
  
}

