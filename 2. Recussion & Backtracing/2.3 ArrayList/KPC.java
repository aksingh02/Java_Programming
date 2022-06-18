import java.util.*;
public class KPC {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num: ");
        String str = s.next();
        ArrayList<String> mr = getKPC(str);
        System.out.println(mr);
        s.close();
    }    
    public static ArrayList<String> getKPC(String str){
        String[] gw = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        if(str.length() == 0){
            ArrayList<String> ba1 = new ArrayList<>();
            ba1.add("");
            return ba1;
        } 
        char ch = str.charAt(0);
        String ss = str.substring(1);
        ArrayList<String> rr = getKPC(ss);

        ArrayList<String> a2 = new ArrayList<>();
        String sagw = gw[ch - '0'];
        for(int i = 0; i < sagw.length(); i++){
            char ch1 = sagw.charAt(i);
            for(String ls : rr){
                a2.add(ch1 + ls);
            }
        }
        return a2;
    }
}
