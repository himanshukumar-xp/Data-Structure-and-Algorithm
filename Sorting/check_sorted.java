import java.util.Scanner;

public class check_sorted {

    public static void main(String[] args) {
       int[] arr = {2,1,45,70,67,0,3};
       for(int i =0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) 
            System.out.print("not sorted");
            
          
        }
        System.out.println("sorted");
        

    }
}