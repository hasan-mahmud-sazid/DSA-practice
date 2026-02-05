public class Reverse {

  public static void main (String arg []){
    int n =1098;
    int rev = 0;

    while (n>0) {
      int ld = n%10;
      rev = (rev*10)+ld;
      n=n/10;
    }
    System.out.println(rev);
  }
}
