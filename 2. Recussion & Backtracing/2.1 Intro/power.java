import java.util.*;
public class power {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base num :");
        int x = s.nextInt();
        System.out.println("Enter the power for base num :");
        int n = s.nextInt();
        int p = power(x, n);
        System.out.println(p);
    }    
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int calp = x * power(x, n -1);
        return calp;
    }
}
