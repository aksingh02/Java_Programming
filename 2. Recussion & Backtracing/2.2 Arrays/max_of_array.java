import java.util.*;
class max_of_array{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr [] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }   
        int m = maxArr(arr, 0);
        System.out.println(m);
        s.close();
    }
    public static int maxArr(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = maxArr(arr, idx + 1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}