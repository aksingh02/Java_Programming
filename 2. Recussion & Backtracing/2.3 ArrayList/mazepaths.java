import java.util.*;
public class mazepaths {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dr and dc : ");
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> mymazepaths = getMazePaths(1, 1, n, m);
        System.out.println(mymazepaths);
        s.close();
    }    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sc == dc && sr == dr){
            ArrayList<String> ba1 = new ArrayList<>();
            ba1.add("");
            return ba1;
        }
        ArrayList<String> hmaze = new ArrayList<>();
        ArrayList<String> vmaze = new ArrayList<>();
        if(sc < dc){
            hmaze = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vmaze = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> a2 = new ArrayList<>();
        for(String paths : hmaze){
            a2.add("h" + paths);
        }  
        for(String paths : vmaze){
            a2.add("v" + paths);
        }    
        return a2;     // [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
    }
}
