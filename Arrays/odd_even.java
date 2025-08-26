public class odd_even {
    
    public static void main(String[] args) {
        int[] arr = {2,3,6,10,8,0,1};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i] *=2;
            }
            else{
                arr[i] += 10;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
