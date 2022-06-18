import java.util.*;
public class Span {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ans[] = spanSolution(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
            scn.close();
        }
    }

    public static int [] spanSolution(int a[]){
        int span[] = new int[a.length];
        Stack<Integer> stc = new Stack<>();

        span[0] = 1;
        stc.push(0);

        for(int i = 1; i < a.length; i++){
            while(stc.size() > 0 && a[i] >= a[stc.peek()]){
                stc.pop();
            }
            if(stc.size() == 0){
                span[i] = i + 1;
            }
            else{
                span[i] = i - stc.peek();
            }
            stc.push(i);
        }
        return span;
    }
}
