public class LinearSerch {
  public static int linearSerch(int arr[], int key){
    for(int i=0; i<arr.length; i++){
    if(arr[i] == key){
      return i;
    }
    }
    return -1;
  }


  public static void main (String[] arg){

    int arr[] = {10,20,30,40};
    System.out.println(linearSerch(arr, 50));
  }
}
