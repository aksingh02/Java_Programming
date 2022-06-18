import java.util.*;

public class Brac {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = checkBrac(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = checkBrac(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = checkBrac(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkBrac(Stack<Character> st, char ch1) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != ch1) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

}
// [(a+b)+{(c+d)*(e/f)}] [{()}]