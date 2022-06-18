import java.util.*;
public class Subseq {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();                             // eg. abc
        ArrayList<String> a1 = gss(str);
        System.out.println(a1);
        s.close();
    }    
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){                             // base case 
            ArrayList<String> ba1 = new ArrayList<>();     // new blank array
            ba1.add("");                                   // adding null in ba1
            return ba1;                                   
        }
        char a = str.charAt(0);                        // getting charracter at 0 -> a
        String ros = str.substring(1);                 // getting rest of the string at 1 -> bc
        ArrayList<String> rstr = gss(ros);             // calling recussive call for remaing string -> [., c, b, bc]
        
        ArrayList<String> a2 = new ArrayList<>();
        for(String x : rstr){                          // to get rstr in new arr -> [., c, b, bc]
            a2.add("" + x);                            // adind null in rstr -> [., c, b, bc]
            // a2.add(a + x); 
        }
        for(String x : rstr){                          // to get rstr in new arr -> [., c, b, bc]
            a2.add(a + x);                             // adind null in rstr -> [., c, b, bc, a, ac, ab, abc]
        }
        return a2;
    }
}
