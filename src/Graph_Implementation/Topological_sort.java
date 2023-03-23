package Graph_Implementation;
import java.util.*;

public class Topological_sort {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public Topological_sort(int v){
        for (int i=1;i<=v;i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void AddEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
    }

    public void topological_sort(){
        int []in = Indegree();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int rv = q.remove();
            System.out.print(rv+" ");
            for(int nbrs:map.get(rv).keySet()){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        System.out.println();
    }

    public boolean IsCycle() {
        int[] in = Indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        int count = 0;
        while (!q.isEmpty()) {
            int rv = q.poll();
            count++;
            for (int nbrs : map.get(rv).keySet()) {
                in[nbrs]--;
                if (in[nbrs] == 0) {
                    q.add(nbrs);
                }
            }
        }
        return count != map.size();

    }

    public int[] Indegree(){
        int in[] = new int[map.size()+1];
        for(int key : map.keySet()){
            for(int nbrs : map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }

    public static void main(String[] args) {
        Topological_sort t = new Topological_sort(7);
        t.AddEdge(1, 2,0);
//        t.AddEdge(2, 1,0);
        t.AddEdge(1, 4,0);
        t.AddEdge(2, 3,0);
        t.AddEdge(3, 6,0);
        t.AddEdge(1, 2,0);
        t.AddEdge(4, 3,0);
        t.AddEdge(4, 6,0);
        t.AddEdge(4, 5,0);
        t.AddEdge(5, 7,0);
        t.AddEdge(5, 6,0);
        t.AddEdge(7, 6,0);
        System.out.println(Arrays.toString(t.Indegree()));
        t.topological_sort();
        System.out.println(t.IsCycle());

    }
}
