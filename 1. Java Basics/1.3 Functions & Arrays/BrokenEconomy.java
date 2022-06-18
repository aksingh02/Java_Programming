import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        System.out.println("Enter the element(s) of array: ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the base number : ");
        int d = s.nextInt();
        /*
         * int [] a = {10, 20, 30, 40, 50};
         * int d = 30;
         */
        int l = 0;
        int h = a.length - 1;
        int c = 0;
        int f = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (d < a[mid]) {
                h = mid - 1;
                c = a[mid];
            } else if (d > a[mid]) {
                l = mid + 1;
                f = a[mid];
            } else {
                c = f = a[mid];
                break;
            }
        }
        System.out.println("Floor and Ceil are : " + f + " and " + c);
    }
}