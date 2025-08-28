import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists_Basics {
    public static void main(String[] args) {
      ArrayList<Integer> arr = new  ArrayList<>();
      arr.add(25);
      arr.add(7);
      arr.add(21);
      arr.add(02);
      arr.add(10);

    //   System.out.println(arr.get(1));
      arr.set(3,50);
    //   System.out.println(arr.get(3));
    //   System.out.println(arr);
    //   int n = arr.size();
    //   for(int i=0; i<n; i++){
    //     System.out.print(arr.get(i)+" ");
    //   }
    //   for(int ele: arr){
    //     System.out.print(ele+" ");
    //   }
    arr.add(78);
    // System.out.print(arr);
    arr.add(1,100);
    
    arr.remove(arr.size()-1);
    // System.out.println(arr);

    int i =0, j = arr.size()-1;
    while(i<j){
    int temp = arr.get(i);
    arr.set(i,arr.get(j));
    arr.set(j,temp);
    i++;
    j--;
    }
    // Collections.reverse(arr);
    System.out.println(arr);

    ArrayList<Character> arr2 = new ArrayList<>();
    
    }
}
