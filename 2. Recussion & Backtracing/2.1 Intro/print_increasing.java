import java.util.*;
public class print_increasing {
    public static void main(String [] a){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        increasing(n);
    }
        public static void increasing(int n){
            if(n == 0){
                return;
            }
            increasing(n - 1);
            System.out.println(n);
        }
}
