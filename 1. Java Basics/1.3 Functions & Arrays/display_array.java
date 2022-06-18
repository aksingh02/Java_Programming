import java.util.*;

public class display_array {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int [] a = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i <= n; i++){
            a[i] = s.nextInt();
            System.out.println(a[i]);
        }
    }
    
}
