import java.util.*;
public class stairpaths {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Stair Level: ");
        int n = s.nextInt();                                        //getting input from user eg. 4
        ArrayList<String> mypaths = getPaths(n);                    //making getPths function & passing n input in it
        System.out.println(mypaths);  
        s.close();                             
    }
    public static ArrayList<String> getPaths(int n) {
        if (n == 0) {                                               // base case for recurssion
            ArrayList<String> ba1 = new ArrayList<>();
            ba1.add("");                                            // adding null in blank array1 when n == 0 
            return ba1;                                             // returning blank array1
        }
        else if(n < 0){                                             // base case for recurssion when n less than 0
            ArrayList<String> ba1 = new ArrayList<>();              
            return ba1;                                             // retruning nothing when n less than 0 in blank array1
        }
        ArrayList<String> mypaths1 = getPaths(n - 1);               // recurssion call for n-1 i.e, 4-1=3 till 0 which returns pathss->["1"] and so on
        ArrayList<String> mypaths2 = getPaths(n - 2);               // recurssion call for n-2 i.e, 4-2=2 till 0 which returns pathss->["2"] and so on
        ArrayList<String> mypaths3 = getPaths(n - 3);               // recurssion call for n-1 i.e, 4-3=1 till 0 which returns pathss->["3"] and so on

        ArrayList<String> a1 = new ArrayList<>();
        for(String paths : mypaths1){                               // getting every possible paths for n-1 in  String paths
            a1.add("1" + paths);                                    // adding "1" in staring intermediate every paths 
        }
        for(String paths : mypaths2){                               // getting every possible paths for n-2 in  String paths
            a1.add("2" + paths);                                    // adding "2" in staring intermediate every paths
        }
        for(String paths : mypaths3){                               // getting every possible paths for n-3 in  String paths
            a1.add("3" + paths);                                    // adding "3" in staring intermediate every paths
        }
        return a1;                                                  // finally we get arraylist of -> [1111, 112, 121, 13, 211, 22, 31]
    }
}
