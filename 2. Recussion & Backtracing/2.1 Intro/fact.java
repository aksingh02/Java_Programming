import java.util.*;
class fact{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num :");
        int n = s.nextInt();

        int f = getFactorial(n);
        System.out.println(f);
    }
    public static int getFactorial(int n){
        if(n == 0){
            return 1;
        }
        int gf = n * getFactorial(n - 1);
        return gf;
    }
}