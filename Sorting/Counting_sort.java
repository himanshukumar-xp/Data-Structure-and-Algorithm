public class Counting_sort {

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       int[] arr = {5,4,1,3,2,0,11};
       countingSort(arr);
    }
}
