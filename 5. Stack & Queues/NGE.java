// import java.io.*;
// import java.util.*;

// public class NGE{
//   public static void display(int[] a){
//     StringBuilder sb = new StringBuilder();

//     for(int val: a){
//       sb.append(val + "\n");
//     }
//     System.out.println(sb);
//   }

// public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     int[] a = new int[n];
//     for(int i = 0; i < n; i++){
//        a[i] = Integer.parseInt(br.readLine());
//     }

//     int[] nge = solve(a);
//     display(nge);
//  }

//  public static int[] solve(int[] arr){
//     int[] nge = new int[arr.length];
//     Stack<Integer> stc = new Stack<>();
    
//     nge[arr.length-1] = -1;
//     stc.push(arr[arr.length-1]);
    
//     for(int i = arr.length - 2; i >= 0; i--){
//         while(stc.size() > 0 && arr[i] >= stc.peek()){
//             stc.pop();
//         }
//         if(stc.size() == 0){
//             nge[i] = -1;
//         }
//         else{
//             nge[i] = stc.peek();
//         }
//         stc.push(arr[i]);
//     }
    
//    return nge;
//  }

// }

//Java program to read and print elements a array using for
import java.util.Scanner;
import java.util.Stack;
class NGE{
  //   public static void display(int[] a){
  //   StringBuilder sb = new StringBuilder();

  //   for(int val: a){
  //     sb.append(val + "\n");
  //   }
  //   System.out.println(sb);
  // }
public static void main (String args[]){
  Scanner scn = new Scanner(System.in);
    int len = scn.nextInt();                      // 5
    int arr[] = new int[len];                     //inndex - 0 1 2 3 4
    for(int i = 0; i < arr.length; i++){          //         3 2 9 6 12
      arr[i] = scn.nextInt();
    }
    int nge[] = solution(arr); 
    for(int i = 0; i < nge.length; i++){
      System.out.println(nge[i]);
    }
    // display(nge);
    scn.close();
}
public static int[] solution(int [] a){

  int ngn [] = new int[a.length];
  Stack<Integer> stc = new Stack<>();

  ngn[a.length - 1] = -1;
  stc.push(a[a.length - 1]);
  

  for(int i = a.length - 2; i >= 0; i--){
    while(stc.size() > 0 && a[i] >= stc.peek()){
      stc.pop();
    }
    if(stc.size() == 0){
      ngn[i] = -1;
    }
    else{
      ngn[i] = stc.peek();
    }
    stc.push(a[i]);
    }

  return ngn;
}
}
