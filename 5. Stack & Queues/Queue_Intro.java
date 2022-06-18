import java.util.*;
public class Queue_Intro {
    public static void main(String args[]){

        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        System.out.println(q);
        q.add(11);
        System.out.println(q);
        q.add(12);
        System.out.println(q);
        q.add(13);
        System.out.println(q);

        q.remove();
        q.remove();
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.size());
    }    
}

