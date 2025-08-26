import java.util.Arrays;
public class Sort_an_array {
    
    public static void main(String[] args) {
      // sort  
      int[] arr = { 2,34,6,0,1,45,78};
      print(arr);
      Arrays.sort(arr);
      print(arr);
    }
      public static void print(int[] arr) {
      for(int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      }
    
}
