import java.util.*;
public class j_maze_paths {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Dest_row & Dest_col :");
        int x = s.nextInt();
        int y = s.nextInt();
        ArrayList<String> mypaths = zig_zagMazePaths(1, 1, x, y);
        System.out.println(mypaths);
        s.close();
    }
    public static ArrayList<String> zig_zagMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr){
            ArrayList<String> ba1 = new ArrayList<>();
            ba1.add("");
            return ba1;
        }
        ArrayList<String> a2 = new ArrayList<>();

            for(int ms = 1; ms <= dr - sr; ms++){
                ArrayList<String> vpaths = zig_zagMazePaths(sr + ms, sc, dr, dc);
                for(String paths : vpaths){
                    a2.add("v" + ms + paths);
                }
            }
            for(int ms = 1; ms <= dc - sc; ms++){
                ArrayList<String> hpaths = zig_zagMazePaths(sr , sc + ms, dr, dc);
                for(String paths : hpaths){
                    a2.add("h" + ms + paths);
                }
            }
            for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
                ArrayList<String> dpaths = zig_zagMazePaths(sr + ms, sc + ms, dr, dc);
                for(String paths : dpaths){
                    a2.add("d" + ms + paths);
                }
            }
    return a2;
}
}
