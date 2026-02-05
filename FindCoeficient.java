public class FindCoeficient {
  public static int factorial(int n){
    int f = 1;
    for(int i=1; i<=n; i++){
      f = f*i;
    }
    return f;
  }

  public static int findCoeficient(int n, int r){
    int nfact = factorial(n);
    int rfact = factorial(r);
    int nrFact = factorial(n-r);
    
    int BC = nfact/(rfact*nrFact);

    return BC;
  }

  public static void main(String[] args) {
    System.out.println(findCoeficient(10, 2));
  }

}
