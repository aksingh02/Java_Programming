import java.util.*;
public class last_idx {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr [] = new int[n];
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number that you wnat to search in the array :");
        int x = s.nextInt();
        int m = maxArr(arr, 0, x);
        System.out.println(m);
        s.close();
    }
    public static int maxArr(int arr[], int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int liisa = maxArr(arr, idx + 1, x);
        if(liisa == -1){
            if(arr[idx] == x){
                return idx;
            }
            else{
                return -1;
            }
        }     
        else{       
            return liisa;
        }
        
    }
    
}
