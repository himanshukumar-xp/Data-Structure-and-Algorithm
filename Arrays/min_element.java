public class min_element {
    public static void main(String[] args) {
                int[] arr = {23,45,1,24,67,8,90,34};

        int min = arr[0];
        // int min = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
              min = arr[i];
            }
            
        }
        System.out.println("Min is: "+min);
    }
}
