import java.util.*;

public class diff_of_two_arrays {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of 1st array: ");
        int n1 = s.nextInt();
        System.out.println("Enter the value(s) of 1st array: ");
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }
        System.out.println("Enter the size of 2st array: ");
        int n2 = s.nextInt();
        System.out.println("Enter the value(s) of 2nd array: ");
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = s.nextInt();
        }

        int[] diff = new int[n2];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        int b = 0; // b is borrow

        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + b >= a1v) {
                d = a2[j] + b - a1v;
                b = 0;
            } else {
                d = a2[j] + b + 10 - a1v;
                b = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        System.out.println("Difference of two arrays are: ");
        while (idx < diff.length) {
            System.out.println(diff[idx++]);

        }
    }
}
