public class Binary_Search {

    public static void BinarySearch(int[] arr){
        int target = -3;
        int n = arr.length;
        int low =0, high = n-1;
        int mid = (low + high)/2;
        while(i<=j){
            if(arr[mid] > target){
                high =  mid -1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                (arr[mid] == target);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9911,99999};
        BinarySearch(arr);
    }
}