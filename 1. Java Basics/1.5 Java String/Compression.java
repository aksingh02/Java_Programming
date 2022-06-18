import java.util.*;

public class Compression {

  public static String compression1(String str) {
    String s = str.charAt(0)+"";
    for (int i = 1; i < str.length(); i++) {
      char crr = str.charAt(i);
      char prev = str.charAt(i - 1);
      if (crr != prev) {
        s = s + crr;
      }
    }
    return s;
  }

  public static String compression2(String str) {
    String s = str.substring(0, 1);
    int c = 1;
    for (int i = 1; i < str.length(); i++) {
      char crr = str.charAt(i);
      char prev = str.charAt(i - 1);
      if (crr == prev) {
        c++;
      } else {  
        if (c > 1) {
          s = s + c;
          c = 1;
        }
        s = s + crr;
      }
    }
     if (c > 1) {
          s = s + c;
          c = 1;
        }
    return s;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
    scn.close();
  }
}
