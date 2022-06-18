import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        //int k = 2*n - 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+(i+j)+" ");
            }
            System.out.println();
        }
    }
}