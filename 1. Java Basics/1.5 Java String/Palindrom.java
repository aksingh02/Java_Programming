import java.util.*;
public class Palindrom {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
    scn.close();
  }
public static boolean plndrm(String str){
    int l = 0;
    int h = str.length()-1;
    while(l <= h){
        char c1 = str.charAt(l);
        char c2 = str.charAt(h);
        if(c1 == c2){
            l++;
            h--;
        }
        else{
            return false;
        }
    }
    return true;
}
  public static void solution(String str) {

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        String subs = str.substring(i, j);
        if (plndrm(subs) == true) {
          System.out.println(subs);
        }
      }
    }
  }
}