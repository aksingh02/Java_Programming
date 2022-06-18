import java.util.*;

public class ACII {
	public static String solution(String str){
	StringBuilder sb = new StringBuilder();
	sb.append(str.charAt(0));	
	for(int i = 1; i < str.length(); i++ ){
	    char c = str.charAt(i);
	    char p = str.charAt(i - 1);
	    int gap = c - p;
	    
	    sb.append(gap);
	    sb.append(c);
	}
	return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
		scn.close();
	}
}