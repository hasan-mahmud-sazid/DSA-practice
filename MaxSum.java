public class MaxSum {

  public static void maxSum(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += arr[k];
        }
        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6 };
    maxSum(arr);
  }
}
