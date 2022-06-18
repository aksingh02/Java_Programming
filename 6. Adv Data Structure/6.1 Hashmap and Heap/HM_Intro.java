import java.util.*;
public class HM_Intro {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        // HashMap<String, Integer> hm = new HashMap<>();
    // hm.put("In", 140);
    // hm.put("US", 33);
    // hm.put("Pak", 25);
    // hm.put("Aus", 2);
    // hm.put("UK", 10);
    // System.out.println(hm);

    // hm.put("DL", 3);
    // hm.put("IN", 135);
    // hm.put("HR", 2);
    // System.out.println(hm);

    // int val = hm.get("In");
    // System.out.println("India : " + val);
    // System.out.println(hm.get("US"));

    // System.out.println(hm.containsKey("UK"));
    // System.out.println(hm.containsKey("UP"));

    // Set<String> keys = hm.keySet();
    // System.out.println(keys);

    // for(String str : hm.keySet()){
    //     Integer num = hm.get(str);
    //     System.out.println(str + " " + num);
    // }
 
    int n1 = scn.nextInt();
    int input[] = new int[n1];
    for(int i = 0; i < n1; i++){
        input[i] = scn.nextInt(); 
    }
    scn.close();
    // HashMap<Integer, Integer> hm = new HashMap<>();
    // for(int val : arr1){
    //     hm.put(val, 1);
    // }
    // Set<Integer> key = hm.keySet();
    // System.out.println(key);

    if(n1 == 0)
            return;
        HashMap<Integer,Integer> h = new HashMap<>();
        int num = 0;
        for(int i = 0; i < n1; i++)
        {   
            if(h.containsKey(-input[i]) && h.get(-input[i]) != 0){
                int count = h.get(-input[i]);
                
                while(count!=0)
                {   if(input[i]>0){
                    System.out.println(-input[i] +" "+ input[i]);
                    num++;
                }
                 else{
                    System.out.println(input[i] +" "+( -input[i]));
                    num++;
                 }
                 count--;
                }
                if(h.containsKey(input[i]))
                    h.put(input[i],h.get(input[i])+1);
                else
                    h.put(input[i],1);
            }
            else{
                if(h.containsKey(input[i])){
                    h.put(input[i],h.get(input[i])+1);
                }else{
                    h.put(input[i] ,1);
                }
            }
        }
        System.out.println(num);
    }
}
