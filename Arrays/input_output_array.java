import java.util.Scanner;

public class input_output_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //   int[] arr = { 5,-8,2,67,43,-97};
      
    //   for(int i = 0; i<arr.length; i++){
    //   System.out.print(arr[i]+" ");
    //   }
    // int i = 0;
    // while (i<arr.length) {
    //     System.out.print(arr[i]+" ");
    //     i++;
    // }

    int[] hp = new int[7];
    // for(int i = 0; i<hp.length; i++){
    //     System.out.print(hp[i]);
    // }

    for(int i=0; i<hp.length; i++){
        hp[i]= sc.nextInt();
    }
    for(int i=0; i<hp.length; i++){
        System.out.print(hp[i]+" ");
    }
    }
}

