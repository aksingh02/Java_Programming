// import java.io.*;
// import java.util.*;
// public class LAH {
//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     int[] a = new int[n];
//     for (int i = 0; i < n; i++) {
//       a[i] = Integer.parseInt(br.readLine());
//     }

//     int lah = lahSolution(a); 
//     System.out.println(lah);
//   }
//   public static int lahSolution(int arr[]) {

//     int rb [] = new int[arr.length];
//     Stack<Integer> stc = new Stack<>();

//     stc.push(arr[arr.length - 1]);
//     rb[arr.length - 1] = arr.length;

//     for (int i = arr.length - 2; i >= 0; i--) {
//       while (stc.size() > 0 && arr[i] <= arr[stc.peek()]) {
//         stc.pop();
//       }
//       if (stc.size() > 0) {
//         rb[i] = stc.peek();
//       }
//       else {
//         rb[i] = arr.length;
//       }
//       stc.push(i); 
//     }

//     int lb [] = new int[arr.length];
//     stc = new Stack<>();
    
//     stc.push(0);
//     lb[0] = -1;
//     for (int i = 1; i < arr.length; i++) {
//       while (stc.size() > 0 && arr[i] <= arr[stc.peek()]) {
//         stc.pop();
//       }
//       if (stc.size() > 0) {
//         lb[i] = stc.peek();
//       }
//       else {
//         lb[i] =  -1;
//       }
//       stc.push(i);
//     }
//     int maxArea = 0;
//     for(int i = 0; i < arr.length; i++){
//         int width = rb[i] - lb[i] - 1;
//         int area = width * arr[i];
//         if(area > maxArea){
//             maxArea = area;
//         }
//     }
//     return maxArea;
//   }
// }

import java.util.*;
public class LAH{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println("Enter the elements:");
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

      int rb[] = new int[arr.length];
      Stack<Integer> stc = new Stack<>();
      rb[arr.length - 1] = arr.length;
      stc.push(arr.length - 1);
      for(int i = arr.length - 2; i >= 0; i--){
        while(stc.size() > 0 && arr[i] <= arr[stc.peek()]){
          stc.pop();
        }
        if(stc.size() == 0){
          rb[i] = arr.length;
        }
        else{
          rb[i] = stc.peek();
        }
        stc.push(i);
      }

      int lb[] = new int[arr.length];
      stc = new Stack<>();
      lb[0] = -1;
      stc.push(0);
      for(int i = 1; i < arr.length; i++){
        while(stc.size() > 0 && arr[i] <= arr[stc.peek()]){
          stc.pop();
        }
        if(stc.size() == 0){
          lb[i] = -1;
        }
        else{
          lb[i] = stc.peek();
        }
        stc.push(i);
      }

      int maxArea = 0;
      for(int i = 0; i < arr.length; i++){
        int width = rb[i] - lb[i] - 1;
        int area = width * arr[i];
        if(area > maxArea){
          maxArea = area;
        }
      }
      System.out.println(maxArea); 
  }
}