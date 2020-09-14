public class ArrayReverse {

  static void reverseArray(int arr[]) {
    
    int b;
    for(int i = 0; i < arr.length/2; i++) {
      b = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length -1 - i] = b;
    }
    
    for(int k = 0; k < arr.length; k++) {
      System.out.println(arr[k]);
    }
  }

  public static void main (String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    reverseArray(arr);
  }
}