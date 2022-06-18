import java.util.*;
public class Matrix_mul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of r1 : ");
        int r1 = s.nextInt();
        System.out.println("Enter size of c1 : ");
        int c1 = s.nextInt();

        System.out.println("Enter values of r1 and c1: ");
        int[][] arr1 = new int[r1][c1];        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        s.close();
        System.out.println("Enter size of r2 : ");
        int r2 = s.nextInt();
        System.out.println("Enter size of c2 : ");
        int c2 = s.nextInt();

        System.out.println("Enter values of r2 and c2: ");
        int[][] arr2 = new int[r2][c2];       
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid Input");
            return;
        }
        int[][] prd = new int[r1][c2];
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += arr1[i][k] + arr2[k][j];
                }
            }
        }
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}