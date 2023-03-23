package Graph_Implementation;
import java.util.*;
import java.util.HashMap;

public class Dijkastra_Algorithm {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public Dijkastra_Algorithm(int v){
        for (int i=1;i<=v;i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void AddEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    private class Dijkastra_pair{
        int vtx;
        String acq_path;
        int cost;
        public Dijkastra_pair(int vtx, String acq_path, int cost){
            this.acq_path=acq_path;
            this.vtx=vtx;
            this.cost=cost;
        }
        @Override
        public String toString() {
            return this.vtx + " via " + this.acq_path + " @ " + this.cost;
        }
    }

    public void DijkastraAlgo(){
        PriorityQueue<Dijkastra_pair> pq = new PriorityQueue<>(new Comparator<Dijkastra_pair>() {
            @Override
            public int compare(Dijkastra_pair o1, Dijkastra_pair o2) {
                return o1.cost- o2.cost;
            }
        });
        Set<Integer> visited = new HashSet<>();
        pq.add(new Dijkastra_pair(1,"1",0));
        while (!pq.isEmpty()){
            Dijkastra_pair rp = pq.remove();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for (int nbrs: map.get(rp.vtx).keySet()) {
                if(!visited.contains(nbrs)){
                    int cost=rp.cost+map.get(rp.vtx).get(nbrs);
                    pq.add(new Dijkastra_pair(nbrs,rp.acq_path+nbrs,cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Dijkastra_Algorithm pa = new Dijkastra_Algorithm(7);
        pa.AddEdge(1, 2, 2);
        pa.AddEdge(2, 3, 3);
        pa.AddEdge(1, 4, 10);
        pa.AddEdge(4, 5, 8);
        pa.AddEdge(3, 4, 1);
        pa.AddEdge(5, 6, 5);
        pa.AddEdge(5, 7, 6);
        pa.AddEdge(6, 7, 4);
        pa.DijkastraAlgo();
    }
}
