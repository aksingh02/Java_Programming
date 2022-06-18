import java.util.*;
public class Duplicate_Brackets{
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        String brac = s.next();
        s.close();
        Stack<Character> stc = new Stack<>();
        for(int i = 0; i < brac.length(); i++){
            char ch = brac.charAt(i);
            if(ch == ')'){
                if(stc.peek() == '('){ 
                    System.out.println(true);
                    return;
                }
                else{
                    while(stc.peek() != '('){
                        stc.pop();
                    }
                    stc.pop();
                }
            }
            else{
                stc.push(ch);
            }
        }
        System.out.println(false);
        
    }
}
//(a+b)+((c+d))