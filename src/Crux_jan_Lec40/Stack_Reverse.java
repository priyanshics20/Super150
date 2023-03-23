package Crux_jan_Lec40;

import java.util.Stack;

public class Stack_Reverse {
    //reverse stack without using extra space
    //recursive solution O(1) - space complexity
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println("*****************");
        reverse(st);
        System.out.println(st);

    }

    public static void reverse(Stack<Integer> st){
        if(st.isEmpty())
            return;
        int popped = st.pop();
        reverse(st);
//        st.push(popped);
        insert_down(st,popped);
    }

    public static void insert_down(Stack<Integer> st , int x){
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int y=st.pop();
        insert_down(st,x);
        st.push(y);
    }
}
