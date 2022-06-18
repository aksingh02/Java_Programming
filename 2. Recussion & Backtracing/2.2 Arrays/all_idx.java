import java.util.*;
public class all_idx {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = s.nextInt();
        System.out.print("Enter the elements of the array :");
        int arr [] = new int[n];
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the number that you wnat to search in the array :");
        int x = s.nextInt(); 
        int xarr[] = maxArr(arr, 0, x, 0);

        if(xarr.length == 0){
            System.out.print("Invalid Return");
        }

        for(int i = 0; i < xarr.length; i++){
            System.out.println(xarr[i]);
        }     
        s.close(); 
    }
    public static int[] maxArr(int arr[], int idx, int x, int count){
        if(idx == arr.length){
            return new int [count];
        }

        int a2 [];
        if(arr[idx] == x){
            a2 = maxArr(arr, idx + 1, x, count + 1);
            a2[count] = idx;
        }
        else{
            a2 = maxArr(arr, idx + 1, x, count);
        }
        return a2;
    }
}

