import java.util.Scanner;

public class Search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[4];
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean flag = false;
        for(int i=0; i<arr.length; i++){
         if(arr[i] == target){
            System.out.println("Target at index: "+i);
            flag = true;      
            break;
         }
        }
         if (flag == true) System.out.print("Found "+target);
         else System.out.println("Not Found");
        
    }
}
