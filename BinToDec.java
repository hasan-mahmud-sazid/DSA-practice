import java.util.*;

public class BinToDec {
  public static int binToDec(int n){
    int power = 0;
    int decimal = 0;

    while (n>0) {
      int lastDigit = n%10;
      decimal = decimal+lastDigit*(int)Math.pow(2, power);
      n = n/10;
      power++;
    }
    return decimal;
  }
  public static void main(String[] args) {
   System.out.println(binToDec(10));
  }
}
