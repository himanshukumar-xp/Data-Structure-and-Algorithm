import java.util.Scanner;

public class String_Basics {

    public static void main(String[] args) {
        // char[] arr = {'H','i','m','a','n','s','h','u'};
        // for(char ele: arr){
        //     System.out.print(ele+" ");
        // }
       Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        //  System.out.println(s);
   
        String s = "ygyuswmcvlnbvaueepobgijuhywercaijsx";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
            
        }

    }