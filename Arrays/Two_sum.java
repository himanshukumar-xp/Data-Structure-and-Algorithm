public class Two_sum {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int target = 0;
       for(int i =0; i<arr.length; i++)
       {
         for(int j=i+1; j<arr.length; j++)
          {
            if(arr[i]+arr[j]== target)
            {
                arr[0]=i;
                arr[1]=j;
                break;
            }
          }
       }
       System.out.println(arr);
    }
}
