import java.util.*;
public class get_sub_seq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scn.next();
        get_SS(str, "");
        scn.close();
    }

    public static void get_SS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        get_SS(ros, "" + ans);
        get_SS(ros, ch + ans);

    }
}