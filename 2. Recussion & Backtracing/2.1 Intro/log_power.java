import java.util.*;
public class log_power {
    public static void main(String args[]){
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
        int logP = power(x, n/2);
        int callogP = logP * logP;
        if(n % 2 == 1){
            callogP = logP * logP * x;
        }
        return callogP;
    }
}
  
