public class FindFactorial {

  public static int findFactorial(int n){
    int f = 1;
    for(int i=1; i<=n; i++){
      f = f*i;
    }
    return f;
  }

  public static void main(String[] args) {
    int n = 4;
    int factorial = findFactorial(n);
    System.out.println(factorial);
  }
  
}
