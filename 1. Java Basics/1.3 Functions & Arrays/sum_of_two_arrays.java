import java.util.*;

public class sum_of_two_arrays {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1 array");
        // taking input for n1
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter n2 array");
        // taking input for n2
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        // finding which one is greater n1 or n2, So we can decide the length of []sum
        int[] sum = new int[n1 > n2 ? n1 : n2];

        // Subtracting -1 from array length to reach at last index of following arrays
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        // Intializing carry with 0
        int c = 0;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d = d + arr1[i];
            }
            if (j >= 0) {
                d = d + arr2[j];
            }

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        System.out.println("Sum of n1 + n2 array :");
        if (c > 0) {
            System.out.print(c);
        }
        for (int m = 0; m < sum.length; m++) {
            System.out.print(sum[m]);
        }
    }
}