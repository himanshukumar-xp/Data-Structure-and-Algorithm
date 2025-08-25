public class max_element {
    public static void main(String[] args) {
        int[] arr = {23,45,1,24,67,8,90,34};

        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
              max = arr[i];
            }
            
        }
        System.out.println("Max is: "+max);
    }
}  
