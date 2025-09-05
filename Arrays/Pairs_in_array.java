public class Pairs_in_array {
    public static void Pairs_in_array(int[] arr){
      int n = arr.length;
       for(int i=0; i<n; i++){
        int curr = arr[i];
        for(int j=i+1; j<n; j++){
          System.out.print("("+ curr +  "," + arr[j] + ")");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Pairs_in_array(arr);
    }
}
