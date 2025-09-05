public class Kth_Smallest {
   public static int kthSmallest(int[] arr, int k) {
      
      int n = arr.length;
        for(int i =0; i<k; i++){
        int minPos = i;
        for(int j =i+1; j<n; j++){
            if(arr[minPos] > arr[j]){
                minPos = j;
            }
        }
        int temp = arr[minPos];
        arr[minPos]=arr[i];
        arr[i] = temp;
        }
        return arr[k-1];
    } 
}
