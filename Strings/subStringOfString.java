public class subStringOfString {
    
    public static void main(String[] args) {
    //   String s = "Himanshu";
    //   System.out.println(s.substring(3));
    //   System.out.println(s.substring(1,4));

       
    // print all substring.
        String s = "gopi";
        for(int i=0; i<s.length(); i++){
           for(int j =i+1; j<=s.length(); j++){
            System.out.print(s.substring(i, j)+" ");
           }
           System.out.println();
        }
    }
}
