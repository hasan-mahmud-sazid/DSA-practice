public class PairsPrint {

  public static void printPairs(int arr[]) {

    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println("( " + curr + "," + arr[j] + ")");
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    printPairs(arr);

  }
}
