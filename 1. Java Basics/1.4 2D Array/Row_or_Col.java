import java.util.*;

public class Row_or_Col {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int input[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = scn.nextInt();
            }
        }
        scn.close();
        int row = input.length;
        int max = Integer.MIN_VALUE;
        int q = 0;
        boolean isRow = true;
        if (row == 0) {
            System.out.println("row " + q + " " + max);
            return;
        }

        int col = input[0].length;
        // row
        for (int i = 0; i < input[0].length; i++) {
            int rsum = 0;
            for (int j = 0; j < input.length; j++) {
                rsum = rsum + input[i][j];
            }
            if (rsum > max) {
                max = rsum;
                q = i;
            }
        }

        // col
        for (int i = 0; i < row; i++) {
            int csum = 0;
            for (int j = 0; j < col; j++) {
                csum += input[j][i];
            }
            if (csum > max) {
                max = csum;
                q = i;
                isRow = false;
            }
        }
        if (isRow) {
            System.out.println("row" + " " + q + " " + max);
        } else {
            System.out.println("column" + " " + q + " " + max);
        }
    }
}
