import java.util.*;
public class zig_zag {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        pp(n);
    }    
    public static void pp(int n){
        if(n == 0){
            return;
       }
       System.out.println("Pre Area" +" "+ n);
       pp(n - 1);
       System.out.println("In Area" +" "+ n);
       pp(n - 1);
       System.out.println("Post Area" +" "+ n);
    }
}
