import java.util.*;
public class dec_inc {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        dec_inc(n);
    }    
    public static void dec_inc(int n){
        if(n == 0){
            return;
       }
       System.out.println(n);
       dec_inc(n - 1);
       System.out.println(n);
    }
}
