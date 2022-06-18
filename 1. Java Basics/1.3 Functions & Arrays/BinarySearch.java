import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        System.out.println("Enter the element(s) of array: ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        } 
        System.out.println("Enter the number that you want to search in array: ");
        int d = s.nextInt();
        /* int [] a = {10, 20, 30, 40, 50};
        int d = 30; */

        int l = 0;
        int h = a.length - 1; 

        while (l <= h) {
            int mid = (l + h) / 2;

            if (a[mid] > d) {
                h = mid - 1;
            } 
            else if (a[mid] < d) {
                l = mid + 1;
            } 
            else {
                System.out.println("Go to index " +mid+ " in array.");
                return;
            }
        }
        System.out.println("Use Your Mind, Assh*le!");
    }
}
