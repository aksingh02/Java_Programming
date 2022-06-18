import java.util.*;
public class Break_words {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int m = scn.nextInt();
        int n = scn.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int j = 0; j < m; j++) {
            arr1[j] = scn.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arr2[j] = scn.nextInt();
        }
        scn.close();

        if(arr1.length == 0 || arr2.length == 0){
            System.out.print("");
        }
        else{
            Arrays.sort(arr1);
        	Arrays.sort(arr2);
            
            int i = 0; 
            int j = 0;
            while(i < arr1.length){ 
                while(j < arr2.length){
                    if(arr1[i] == arr2[j]){
                        System.out.print(arr1[i] + " ");                       
                    }
                    
                    else if(arr1[i] > arr2[j]){
                        j++;
                    }
                    else if(arr1[i] < arr2[j]){
                        i++;
                    }
                    break;
                }
                i++;
                j++;
            }
        }
    }
}
