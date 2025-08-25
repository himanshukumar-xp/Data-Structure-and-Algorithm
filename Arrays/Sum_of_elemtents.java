import java.util.Scanner;

public class Sum_of_elemtents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array size: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.print("Enter Array Elements: ");
        // for(int i =0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // for(int i = 0; i<n; i++){
        //     sum += arr[i];
        //     System.out.println(sum);
        // }

        int[] arr = {2,4,6,8,10};
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            
        }
        System.out.print("Sum is: "+sum);

    }
} 
