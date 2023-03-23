package Crux_jan_Lec40;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_reverse {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);
        System.out.println(qu);
        System.out.println("***************");
        reverse_Queue(qu);
        System.out.println(qu);
    }

    public static void reverse_Queue(Queue<Integer> qu){
        if(qu.isEmpty()){
            return;
        }
        int x = qu.poll();
        reverse_Queue(qu);
        qu.add(x);
    }
}
