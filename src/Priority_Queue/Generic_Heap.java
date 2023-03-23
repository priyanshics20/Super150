package Priority_Queue;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci){
        int pi = (ci-1)/2 ;
        //generic-  list.get(pi) isme priority queue ki kam hai
        //list.get(ci) isme priority queue ki zyada hai
        if(islarger(list.get(pi), list.get(ci))>0){
            swap(pi,ci);
            upheapify(pi);
        }
    }

    public void swap(int i , int j){
        T ith = list.get(i);
        T jth =list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }

    public T remove(){ //remove kar rahe idhr
        swap(0, list.size()-1);
        T rv = list.remove(list.size()-1);
        downheapify(0);
        return rv;

    }

    private void downheapify(int pi){
        //lci = left child index
        int lci = 2*pi+1;
        int rci= 2*pi+2;
        int mini = pi;
        if(lci<list.size() && islarger(list.get(mini),list.get(lci))>0){
            mini=lci;
        }
        if(rci < list.size() && islarger(list.get(mini),list.get(rci))>0){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }

    public T min(){
        return list.get(0);
    }

    public int size(){
        return list.size();
    }

    public void display(){
        System.out.println(list);
    }

    public int islarger(T o1, T o2){
        return o1.compareTo(o2);
    }
}
