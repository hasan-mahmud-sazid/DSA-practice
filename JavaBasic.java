public class JavaBasic {
  public static void main (String arg[]){
    int n = 10899;
    int rev = 0;

    while (n>0) {
      int last_Digit = n%10;
      rev = (rev*10)+last_Digit;
      n /=10;
    }
    System.err.print(rev);
  }
}
